FROM openjdk:8-alpine

ENV XMX=2048m

COPY default-config /opt/com.decathlon.ara/default-config

COPY com.decathlon.ara.jar /opt/com.decathlon.ara/com.decathlon.ara.jar

EXPOSE 8080/tcp

VOLUME /opt/com.decathlon.ara/data

ENTRYPOINT [ "sh", "-c", "java -Xmx$XMX $0 $@", \
             "-Dspring.profiles.active=prod", \
             "-jar", \
             "/opt/com.decathlon.ara/com.decathlon.ara.jar", \
             "--spring.config.location=classpath:/,file:/opt/com.decathlon.ara/default-config/,file:/opt/com.decathlon.ara/data/config/" ]
