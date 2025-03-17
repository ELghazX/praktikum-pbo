FROM openjdk:23-jdk

WORKDIR /app

COPY . /app

RUN mkdir -p out && javac -d out $(ls src/*.java src/*/*.java 2>/dev/null || echo "")

CMD ["java", "-cp", "out", "App"]
