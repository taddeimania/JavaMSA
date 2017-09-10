FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/javamsa-?.?.?.jar app.jar
ENV JAVA_OPTS=""
ENV WHICHDATA="dockerfile"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]
