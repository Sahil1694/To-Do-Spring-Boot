# Use the official OpenJDK 17 image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /usr/src/app

# Copy the application's jar file to the container
COPY target/To-Do-Application-0.0.1-SNAPSHOT.jar /usr/src/app/

# Expose the application port
EXPOSE 9590

# Specify the command to run the application
CMD ["java", "-jar", "To-Do-Application-0.0.1-SNAPSHOT.jar"]
