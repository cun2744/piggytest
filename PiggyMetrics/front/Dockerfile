FROM openjdk:8
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./target/front.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/front.jar"]

EXPOSE 4000