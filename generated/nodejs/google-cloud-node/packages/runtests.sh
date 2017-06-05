#!/bin/bash
EXIT_CODE=0

function run_npm_test {
  cd $1

  # Install dependencies.
  npm install
  INSTALL_RESULT=$?
  if [ $INSTALL_RESULT -ne 0 ]; then
    return $INSTALL_RESULT
  fi

  # Run the tests.
  npm test
  TEST_RESULT=$?
  cd ..
  return $TEST_RESULT
}


for DIR in ./*/; do
  # Sanity check: Do not attempt to test bogus packages.
  if [ ! -f $DIR/package.json ]; then
    continue
  fi

  # Run the tests.
  echo "Running tests: $DIR"
  echo '-------------------'
  run_npm_test $DIR
  SUCCESS=$?
  if [ $SUCCESS -ne 0 ]; then
    EXIT_CODE=$SUCCESS
  fi
done
exit $EXIT_CODE
