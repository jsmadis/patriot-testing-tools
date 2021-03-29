FROM openjdk:11.0-jre-slim

ADD ./rest-service-0.0.1-SNAPSHOT.jar /var/

EXPOSE 8888/udp
CMD ["java", "-jar", "/var/rest-service-0.0.1-SNAPSHOT.jar"]