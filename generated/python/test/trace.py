from google.cloud.gapic.trace.v1 import trace_service_api
from google.devtools.cloudtrace.v1 import trace_pb2

import uuid


# point this at your project ID
PROJECT_ID = 'gapic-test'


api = trace_service_api.TraceServiceApi()
id = uuid.uuid4().hex
trace = trace_pb2.Trace(project_id=PROJECT_ID, trace_id=id, spans=[])
traces = trace_pb2.Traces(traces=[trace])

# Note: does not work currently, fails with INVALID_ARGUMENT
api.patch_traces(PROJECT_ID, traces)

sleep(1)

response = api.get_trace(PROJECT_ID, id)

print response
