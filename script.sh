#!/bin/bash

nodemon --ext jar --watch dist/ --exec 'java -jar dist/bin/hello_world_server_deploy.jar'
