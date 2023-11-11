FROM openjdk:17-oracle
RUN mkdir /app
COPY build/libs/decathlon-point-calculator-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app/
ENTRYPOINT ["java","-jar","decathlon-point-calculator-0.0.1-SNAPSHOT.jar"]