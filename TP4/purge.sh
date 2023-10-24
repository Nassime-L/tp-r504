docker stop $(docker ps -q)
docker rm $(docker ps -q)
docker system prune
