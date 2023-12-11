FROM openjdk:17

WORKDIR /build

ENV SECRET_KEY=secret

ENV LIFE_TIME=600000

ADD /target/Authentication.jar ./Authentication.jar

CMD java -jar Authentication.jar

EXPOSE 8080