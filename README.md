

HOW TO RUN DOCKER IMAGE OF REDIS
------------------------------------------------------------------------------------------
Open command line under the root of the project and run as follow:
docker-compose up -d
stop the container of redis service and run service from intellij



HOW TO RUN REDIS COMMAND (UI via browser)
------------------------------------------------------------------------------------------
docker pull rediscommander/redis-commander:latest
docker run -d   --name redis-commander   -p 8081:8081   --env REDIS_HOSTS=local:localhost:6379   --env HTTP_USER=admin   --env HTTP_PASSWORD=secret   rediscommander/redis-commander:latest
Navigate to http://localhost:8081

