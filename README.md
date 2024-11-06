**Sample Spring Boot 3 Application**

**Introduction**

This is a sample Spring Boot 3 application designed to demonstrate the basic setup and functionality of a Spring Boot project. The application includes a simple REST API that can be used to perform basic GET operations.

**Prerequisites**

Before you begin, ensure you have met the following requirements:

Java Development Kit (JDK) 17 or later Link to download https://developer.ibm.com/languages/java/semeru-runtimes/downloads/
Maven 3.6.3 or later Link - https://maven.apache.org/download.cgi
An IDE such as IntelliJ IDEA, Eclipse, or VS Code Link https://www.jetbrains.com/idea/download/?section=mac

**Getting Started**

Clone the Repository

Clone this repository to your local machine using the following command:

git clone [https://github.com/your-username/sample-springboot3-app.git](https://github.com/ghulsure/springboot-app-skeleton.git)
Build the Application
Navigate to the project directory and build the application using Maven commands:


Navigate: cd sample-springboot3-app
To package: mvn clean install
Running the Application: mvn spring-boot:run 
You can run the application using the following command:

java -jar target/sample-springboot3-app-0.0.1-SNAPSHOT.jar

Alternatively, you can run the application directly from your IDE by running the SampleSpringBoot3Application class.

Accessing the Application
Once the application is running, you can access the REST API at http://localhost:8080/api.

API Endpoints
The following endpoints are available in this sample application:

GET /v1.0/getName - returns sample string message
Required param: x-api-token: "test"
required header param: x-api-key: "test"

**Configuration**
The application can be configured using the application.properties file located in the src/main/resources directory. Here you can set various properties such as the server port, database connection details, etc.
