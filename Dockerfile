ARG BUILD_IMAGE=maven:3.5-jdk-11
ARG RUNTIME_IMAGE=brahimafa/tomcat-manager

FROM ${BUILD_IMAGE} as dependencies
WORKDIR /app
COPY pom.xml ./
RUN mvn -B dependency:go-offline

FROM dependencies as build

COPY src ./src

RUN mvn -B clean package -DskipTests

FROM ${RUNTIME_IMAGE}

COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/service.war
