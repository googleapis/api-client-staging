#!/bin/bash

# Generates javadoc for proto-* and grpc-* packages.
# Javadoc is committed to googleapis repo found in tmp_gh-pages.
# From the 'api-client-staging/generated/java' directory, simply run
#   ./javadocs.sh

set -ex

REV=$(git rev-parse HEAD)
./gradlew allDocs

git clone --branch gh-pages --single-branch git@github.com:googleapis/googleapis.git tmp_gh-pages
cd tmp_gh-pages

# The 'f' flag makes us not fail if the dir doesn't exist.
rm -rf java/all
cp -r ../build/all java
git add -A
git commit -am "update javadocs

api-client-staging: $REV
"

# Do this manually for now.
# Can become fully automatic after we use the script a few times and have some more confidence in it.
#   cd tmp_gh-pages
#   git push
#   cd ..
#   rm -rf tmp_gh-pages
