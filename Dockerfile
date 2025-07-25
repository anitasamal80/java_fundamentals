FROM openjdk:24-jdk
COPY *.java /
RUN javac *.java
CMD [ "java", "Main" ]