from google.cloud.functions.v1beta2 import cloud_functions_service_client
from google.cloud.proto.functions.v1beta2 import functions_pb2
from google.gax.errors import GaxError
from grpc import StatusCode

# point this at your project ID
PROJECT_ID = 'gapic-test'

LOCATION_ID = 'us-central1'
FUNCTION_ID = 'helloWorld'

# upload helloWorld.zip from this directory to Google Storage for your project
SOURCE_URI = 'gs://gapic-functions-v1beta2/helloWorld.zip'

api = cloud_functions_service_client.CloudFunctionsServiceClient()
location = api.location_path(PROJECT_ID, LOCATION_ID)
function_name = api.function_path(PROJECT_ID, LOCATION_ID, FUNCTION_ID)


def on_delete(operation_future):
    try:
        api.get_function(function_name)
    except GaxError as e:
        code = getattr(e.cause, "code", None)
        if callable(code) and code() == StatusCode.NOT_FOUND:
            print('Expect error here since the function should have been deleted')
        else:
            raise


def on_update(operation_future):
    result = operation_future.result()
    print('Function updated: \n%s\n' % result)

    fetched_function = api.get_function(result.name)
    print('Function fetched: \n%s\n' % fetched_function)

    data = '{"message":"Hello World!"}'
    call_response = api.call_function(fetched_function.name, data)
    print('Function call response: \n%s\n' % call_response)

    print('List functions:\n')
    for function in api.list_functions(location):
        print(function)

    print('Delete function:\n')
    delete_response = api.delete_function(function_name)
    delete_response.add_done_callback(on_delete)
    print('Metadata: \n%s\n' % delete_response.metadata())


def on_create(operation_future):
    result = operation_future.result()
    print('Function created: \n%s\n' % result)

    updated_function = functions_pb2.CloudFunction(
        name=result.name,
        source_archive_url=result.source_archive_url,
        pubsub_trigger=('projects/%s/topics/hello_world2' % PROJECT_ID))

    response = api.update_function(result.name, updated_function)
    response.add_done_callback(on_update)
    print('Metadata: \n%s\n' % response.metadata())

def on_init(_):
    function = functions_pb2.CloudFunction(
        name=function_name,
        source_archive_url=SOURCE_URI,
        pubsub_trigger=('projects/%s/topics/hello_world' % PROJECT_ID))
    response = api.create_function(location, function)
    response.add_done_callback(on_create)
    print('Metadata: \n%s\n' % response.metadata())

try:
    response = api.delete_function(function_name)
    response.add_done_callback(on_init)
except GaxError as e:
    code = getattr(e.cause, "code", None)
    if callable(code) and code() == StatusCode.NOT_FOUND:
        on_init(None)
    else:
        raise
