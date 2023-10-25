FROM debian:bullseye
RUN apt-get update && apt-get upgrade -y
RUN apt-get install build-essential -y \
&& apt-get install pkg-config -y \
&& apt-get install python-dev -y \
&& apt-get install python3-pip -y \
&& apt-get install default-libmysqlclient-dev -y \
&& pip3 install --upgrade pip \
&& pip install flask-mysqldb \
&& pip install mysql-connector-python
RUN mkdir -p /srv/templates
COPY index.html /srv/templates
COPY app1.py /srv
CMD ["flask","--app","/srv/app1","run","--host=0.0.0.0"] 


