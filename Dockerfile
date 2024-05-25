FROM us-docker.pkg.dev/bt-play-355619/harness/ubi/java-go-cie-agents/java17:17.0.11-arm64_2

RUN mkdir /app
WORKDIR /app

RUN node -v
RUN npm -v

RUN npm i -g nodemon
RUN nodemon -v

# COPY dist/bin/hello_world_server_deploy.jar /app/hello.jar
COPY script.sh /app/script.sh

EXPOSE 8080
CMD ["/app/script.sh"]