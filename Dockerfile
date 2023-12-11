FROM openjdk:17

WORKDIR /build

ENV SECRET_KEY=secret

ENV LIFE_TIME=600000

ADD /target/Authentication.war ./Authentication.war

EXPOSE 8080