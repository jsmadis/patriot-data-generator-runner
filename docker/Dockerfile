FROM openjdk:11.0-jre-slim

#RUN apk update && apk add openjdk11

ADD ./device-runner.jar /var/
ADD ./test.json /var/

EXPOSE 5683/udp
CMD ["java", "-jar", "/var/device-runner.jar"]