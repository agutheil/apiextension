#!/bin/sh
mvn clean package && docker build -t com.fyayc.micro/apiextension .
docker rm -f apiextension || true && docker run -d -p 8080:8080 -p 4848:4848 --name apiextension com.fyayc.micro/apiextension 