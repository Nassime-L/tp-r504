docker build -t im-nginx-lb .
mkdir shared1 shared2
#touch shared1/index.html shared2/index.html
echo "<h1>Hello 1</h1>" > shared1/index.html
echo "<h1>Hello 2</h1>" > shared2/index.html

#Création du 1er ctn
docker run -d \
	-p 81:80 \
	--name nginx1 \
	--mount type=bind,src=$(pwd)/shared1,target=/usr/share/nginx/html \
	nginx:latest

#Création du 2é ctn
docker run -d \
        -p 82:80 \
        --name nginx2 \
        --mount type=bind,src=$(pwd)/shared2,target=/usr/share/nginx/html \
        nginx:latest

#Création du ctn LB avec l'img créé
docker run -d \
        -p 83:80 \
        --name nginx-LB \
        im-nginx-lb

