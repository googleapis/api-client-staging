from google.cloud.gapic.trace.v1 import enums
from google.cloud.gapic.trace.v1 import trace_service_api
from google.devtools.cloudtrace.v1 import trace_pb2
from google.protobuf import timestamp_pb2

import calendar
import time
import uuid


# point this at your project ID
PROJECT_ID = 'gapic-test'


api = trace_service_api.TraceServiceApi()

id = uuid.uuid4().hex
span_id = 42
span_kind=enums.TraceSpan.SpanKind.RPC_CLIENT
SPAN_NAME = '/foo/bar'

current_time = calendar.timegm(time.gmtime())
start_time = timestamp_pb2.Timestamp(seconds=current_time, nanos=1234567)
end_time = timestamp_pb2.Timestamp(seconds=current_time, nanos=9876543)

span = trace_pb2.TraceSpan(span_id=span_id,kind=span_kind,name=SPAN_NAME,
                           start_time=start_time,end_time=end_time)
trace = trace_pb2.Trace(project_id=PROJECT_ID, trace_id=id, spans=[span])
traces = trace_pb2.Traces(traces=[trace])

api.patch_traces(PROJECT_ID, traces)

time.sleep(1)

response = api.get_trace(PROJECT_ID, id)

print response
