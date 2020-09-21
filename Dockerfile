FROM maven as build
WORKDIR /src
COPY . .
RUN mvn package

FROM openjdk:8
WORKDIR /app
COPY --from=build /src/target .
RUN cp -R classes/bin .
RUN cp -R classes/lib .
CMD ["java", "-Djava.library.path=/app/lib", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 4000/udp
EXPOSE 41000/udp

EXPOSE 1080/tcp
EXPOSE 8000/tcp

EXPOSE 4001-4030/udp
EXPOSE 1080/udp
EXPOSE 8000/udp
EXPOSE 9700/udp
EXPOSE 25000/udp
