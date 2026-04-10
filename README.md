# titanic-lifeguard

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/titanic-lifeguard-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- JDBC Driver - H2 ([guide](https://quarkus.io/guides/datasource)): Connect to the H2 database via JDBC
- Mapstruct ([guide](https://docs.quarkiverse.io/mapstruct/dev/)): MapStruct: Code generator for Java bean mappings using convention over configuration.
- Hibernate with Panache Next ([guide](https://quarkus.io/guides/hibernate-panache-next)): Experimental: Simplify your persistence code for Hibernate ORM and Hibernate Reactive and Jakarta Data
- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern
- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more

## Provided Code

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)

[Related Hibernate with Panache Next section...](https://quarkus.io/guides/hibernate-panache-next)

[Related Hibernate with Panache section...](https://quarkus.io/guides/hibernate-orm-panache)


### RESTEasy JAX-RS

Easily start your RESTful Web Services

## OpenAPI and Swagger UI

OpenAPI and Swagger UI are available in dev mode and production mode at the following URLs:

- OpenAPI: [http://localhost:8080/q/openapi](http://localhost:8080/q/openapi)
- Swagger UI: [http://localhost:8080/q/swagger-ui](http://localhost:8080/q/swagger-ui)

## H2 Server Mode

Go to the user folder (C:\Users\<USER_NAME>\) and create a file named `test.mv.db` and another file named `lifeguard.lock.db` (both empty).
This will create the database when the application starts.


Enable H2 Server Mode, add the following configuration to your `application.properties`:

```properties
quarkus.datasource.db-kind=h2
quarkus.datasource.jdbc.url=jdbc:h2:tcp://localhost:9092/~/titanic-lifeguard
quarkus.datasource.username=sa
quarkus.datasource.password=
```

Before running the application, start the H2 server using the following command:

```
java -cp h2-2.4.240.jar org.h2.tools.Server -tcp -tcpAllowOthers -tcpPort 9092 -web -webPort 8082
```

Run the quarkus app using maven with the following command:

```
./mvnw quarkus:dev
``` 

Clean the project using the following command:

```
./mvnw clean install
```

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
