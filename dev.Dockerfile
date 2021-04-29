# our base build image
FROM maven:3.8.1-openjdk-16-slim as maven

WORKDIR /app

# copy the Project Object Model file
COPY ./pom.xml ./pom.xml

# fetch all dependencies
RUN mvn dependency:go-offline -B


CMD ["mvn", "spring-boot:run"]