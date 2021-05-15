FROM openjdk:11.0-jre-slim

ADD ./spring-boot-0.0.1-SNAPSHOT.jar /var/

EXPOSE 8888/udp
CMD ["java", "-jar", "/var/spring-boot-0.0.1-SNAPSHOT.jar"]