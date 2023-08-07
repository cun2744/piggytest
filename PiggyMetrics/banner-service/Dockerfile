FROM openjdk:8
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./target/banner-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/banner-service.jar"]

EXPOSE 9090