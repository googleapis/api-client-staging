"""Functional test for Google Cloud Vision API."""

from google.cloud.gapic.vision.v1.image_annotator_client import ImageAnnotatorClient
from google.cloud.grpc.vision.v1 import image_annotator_pb2


# upload demo-image.jpg from this directory to Google Storage for your project
image_url = 'gs://gapic-vision-v1/demo-image.jpg'


api = ImageAnnotatorClient()
image_source = image_annotator_pb2.ImageSource(gcs_image_uri = image_url)
image = image_annotator_pb2.Image(source = image_source)

feature = image_annotator_pb2.Feature(type = image_annotator_pb2.Feature.LABEL_DETECTION)
features = [feature]

request = image_annotator_pb2.AnnotateImageRequest(image = image, features = features)
requests = [request]
response = api.batch_annotate_images(requests)

print response.__str__
