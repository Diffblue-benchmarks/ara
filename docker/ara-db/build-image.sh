#!/usr/bin/env bash

if [[ $1 ]]; then
    TAG=$1
    echo "Using tag '${TAG}' from the first argument"
else
    TAG='com.decathlon.ara-db'
    echo "No tag in first argument: using '${TAG}'"
fi

docker build -t ${TAG} .
