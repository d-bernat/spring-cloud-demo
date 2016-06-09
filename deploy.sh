#!/bin/sh
echo Param: $1  $#
if [ $# -gt 1 ]; then
	echo "Only first parameter will be accepted"
fi
cd /spring-cloud-demo
docker-compose stop $1
docker-compose rm -v -f $1
docker-compose build $1
docker-compose up -d $1

echo "Done!"
