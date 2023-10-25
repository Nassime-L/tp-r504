#Création d'un conteneur avec notre image im-tp4
docker run --name tp4-app \
	--network net-tp4 \
	-p 5000:5000 \
	im-tp4:latest
