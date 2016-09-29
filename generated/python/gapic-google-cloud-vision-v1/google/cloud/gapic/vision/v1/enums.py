# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""Wrappers for protocol buffer enum types."""


class Likelihood(object):
    """
    A bucketized representation of likelihood meant to give our clients highly
    stable results across model upgrades.

    Attributes:
      UNKNOWN (int): Unknown likelihood.
      VERY_UNLIKELY (int): The image very unlikely belongs to the vertical specified.
      UNLIKELY (int): The image unlikely belongs to the vertical specified.
      POSSIBLE (int): The image possibly belongs to the vertical specified.
      LIKELY (int): The image likely belongs to the vertical specified.
      VERY_LIKELY (int): The image very likely belongs to the vertical specified.
    """
    UNKNOWN = 0
    VERY_UNLIKELY = 1
    UNLIKELY = 2
    POSSIBLE = 3
    LIKELY = 4
    VERY_LIKELY = 5


class Feature(object):
    class Type(object):
        """
        Type of image feature.

        Attributes:
          TYPE_UNSPECIFIED (int): Unspecified feature type.
          FACE_DETECTION (int): Run face detection.
          LANDMARK_DETECTION (int): Run landmark detection.
          LOGO_DETECTION (int): Run logo detection.
          LABEL_DETECTION (int): Run label detection.
          TEXT_DETECTION (int): Run OCR.
          SAFE_SEARCH_DETECTION (int): Run various computer vision models to compute image safe-search properties.
          IMAGE_PROPERTIES (int): Compute a set of properties about the image (such as the image's dominant colors).
        """
        TYPE_UNSPECIFIED = 0
        FACE_DETECTION = 1
        LANDMARK_DETECTION = 2
        LOGO_DETECTION = 3
        LABEL_DETECTION = 4
        TEXT_DETECTION = 5
        SAFE_SEARCH_DETECTION = 6
        IMAGE_PROPERTIES = 7


class FaceAnnotation(object):
    class Landmark(object):
        class Type(object):
            """
            Face landmark (feature) type.
            Left and right are defined from the vantage of the viewer of the image,
            without considering mirror projections typical of photos. So, LEFT_EYE,
            typically is the person's right eye.

            Attributes:
              UNKNOWN_LANDMARK (int): Unknown face landmark detected. Should not be filled.
              LEFT_EYE (int): Left eye.
              RIGHT_EYE (int): Right eye.
              LEFT_OF_LEFT_EYEBROW (int): Left of left eyebrow.
              RIGHT_OF_LEFT_EYEBROW (int): Right of left eyebrow.
              LEFT_OF_RIGHT_EYEBROW (int): Left of right eyebrow.
              RIGHT_OF_RIGHT_EYEBROW (int): Right of right eyebrow.
              MIDPOINT_BETWEEN_EYES (int): Midpoint between eyes.
              NOSE_TIP (int): Nose tip.
              UPPER_LIP (int): Upper lip.
              LOWER_LIP (int): Lower lip.
              MOUTH_LEFT (int): Mouth left.
              MOUTH_RIGHT (int): Mouth right.
              MOUTH_CENTER (int): Mouth center.
              NOSE_BOTTOM_RIGHT (int): Nose, bottom right.
              NOSE_BOTTOM_LEFT (int): Nose, bottom left.
              NOSE_BOTTOM_CENTER (int): Nose, bottom center.
              LEFT_EYE_TOP_BOUNDARY (int): Left eye, top boundary.
              LEFT_EYE_RIGHT_CORNER (int): Left eye, right corner.
              LEFT_EYE_BOTTOM_BOUNDARY (int): Left eye, bottom boundary.
              LEFT_EYE_LEFT_CORNER (int): Left eye, left corner.
              RIGHT_EYE_TOP_BOUNDARY (int): Right eye, top boundary.
              RIGHT_EYE_RIGHT_CORNER (int): Right eye, right corner.
              RIGHT_EYE_BOTTOM_BOUNDARY (int): Right eye, bottom boundary.
              RIGHT_EYE_LEFT_CORNER (int): Right eye, left corner.
              LEFT_EYEBROW_UPPER_MIDPOINT (int): Left eyebrow, upper midpoint.
              RIGHT_EYEBROW_UPPER_MIDPOINT (int): Right eyebrow, upper midpoint.
              LEFT_EAR_TRAGION (int): Left ear tragion.
              RIGHT_EAR_TRAGION (int): Right ear tragion.
              LEFT_EYE_PUPIL (int): Left eye pupil.
              RIGHT_EYE_PUPIL (int): Right eye pupil.
              FOREHEAD_GLABELLA (int): Forehead glabella.
              CHIN_GNATHION (int): Chin gnathion.
              CHIN_LEFT_GONION (int): Chin left gonion.
              CHIN_RIGHT_GONION (int): Chin right gonion.
            """
            UNKNOWN_LANDMARK = 0
            LEFT_EYE = 1
            RIGHT_EYE = 2
            LEFT_OF_LEFT_EYEBROW = 3
            RIGHT_OF_LEFT_EYEBROW = 4
            LEFT_OF_RIGHT_EYEBROW = 5
            RIGHT_OF_RIGHT_EYEBROW = 6
            MIDPOINT_BETWEEN_EYES = 7
            NOSE_TIP = 8
            UPPER_LIP = 9
            LOWER_LIP = 10
            MOUTH_LEFT = 11
            MOUTH_RIGHT = 12
            MOUTH_CENTER = 13
            NOSE_BOTTOM_RIGHT = 14
            NOSE_BOTTOM_LEFT = 15
            NOSE_BOTTOM_CENTER = 16
            LEFT_EYE_TOP_BOUNDARY = 17
            LEFT_EYE_RIGHT_CORNER = 18
            LEFT_EYE_BOTTOM_BOUNDARY = 19
            LEFT_EYE_LEFT_CORNER = 20
            RIGHT_EYE_TOP_BOUNDARY = 21
            RIGHT_EYE_RIGHT_CORNER = 22
            RIGHT_EYE_BOTTOM_BOUNDARY = 23
            RIGHT_EYE_LEFT_CORNER = 24
            LEFT_EYEBROW_UPPER_MIDPOINT = 25
            RIGHT_EYEBROW_UPPER_MIDPOINT = 26
            LEFT_EAR_TRAGION = 27
            RIGHT_EAR_TRAGION = 28
            LEFT_EYE_PUPIL = 29
            RIGHT_EYE_PUPIL = 30
            FOREHEAD_GLABELLA = 31
            CHIN_GNATHION = 32
            CHIN_LEFT_GONION = 33
            CHIN_RIGHT_GONION = 34
