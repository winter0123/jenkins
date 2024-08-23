# 베이스 이미지
FROM openjdk:17-alpine

# JAR 파일을 컨테이너의 /app 디렉토리에 복사
COPY ./build/libs/jenkins-0.0.1-SNAPSHOT.jar /app.jar

# 애플리케이션 실행
CMD ["java", "-jar", "/app.jar"]

# 포트 노출
EXPOSE 8080