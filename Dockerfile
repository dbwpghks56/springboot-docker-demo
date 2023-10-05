FROM eclipse-temurin:17

LABEL mentainer="wpghks56@gmail.com"

# Docker 컨테이너를 시작할 때마다 이 /app 폴더가 Docker에 생성된다.
WORKDIR /app

COPY build/libs/springboot-docker-demo-0.0.1-SNAPSHOT.jar /app/springboot-docker-demo.jar

ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
