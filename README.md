<img width="1319" alt="Screenshot 2025-07-04 at 3 46 01 PM" src="https://github.com/user-attachments/assets/4eb2e125-9dbc-4d4a-8d6c-e6dd26f37be2" />


🌦 Java Spring Boot Weather REST API Client
COMPANY: CODTECH IT SOLUTIONS
NAME: Sidhi Grover
INTERN ID: CT06DF949
DOMAIN: Java Programming
DURATION: 6 Weeks
MENTOR: Neela Santosh

📚 Description
This project is a Java Spring Boot console-based REST API client that fetches current weather data for a city (Delhi) using the OpenWeatherMap API.

It demonstrates how to:

Perform HTTP GET requests to external REST APIs from Java.

Parse JSON responses into Java objects using Gson.

Handle exceptions gracefully and print structured data to the console.

This builds a strong foundation for understanding how to integrate external web services into Java applications, a critical skill for developing microservices, data consumers, or cloud-connected apps.

⚙️ How It Works
🚀 Application (RestApiClientApplication.java)
When you run the Spring Boot application:

✅ It executes via CommandLineRunner immediately after startup (no HTTP server exposed).

✅ Constructs a URL to call OpenWeatherMap’s weather endpoint for Delhi, including your API key and units in Celsius.

✅ Opens a HttpURLConnection and sends a GET request.

✅ Reads the JSON response from the API using a BufferedReader.

🔍 JSON Parsing
✅ Uses the Gson library to parse the JSON into Java POJOs (WeatherResponse, Main, Weather).

✅ Extracts:

🌆 City name

🌡 Temperature (°C)

💧 Humidity (%)

☁ Weather description (like clear sky).

🖨 Console Output
Prints the structured weather data to the console for easy viewing.

Example output:

makefile
Copy
Edit
City: Delhi
Temperature: 32.5°C
Humidity: 45%
Weather: clear sky
🔍 Detailed Explanation
When the application starts:

🛠 Spring Boot sets up the context and immediately calls run() from CommandLineRunner.

🌐 It builds the API URL for Delhi with your OpenWeatherMap API key.

🔗 Sends a GET request using HttpURLConnection, waits for the JSON response.

📥 Reads the JSON line by line into a StringBuilder.

🪄 Uses Gson to deserialize JSON into Java classes (WeatherResponse, etc.).

🖥 Prints key weather details to the console.

If something fails (invalid key, network error, JSON parse error), it prints a clear message instead of crashing.

✨ Why is this useful?
🧠 Teaches how to consume REST APIs in Java, a must-have skill for building modern applications.

💡 Demonstrates structured JSON parsing using Gson.

🚀 Provides a clean example of Spring Boot without web controllers, useful for microservices, CLI tools, or batch jobs.

🔥 Can be extended easily to:

Take dynamic input for any city.

Call different endpoints (like forecast APIs).

Log data to files or databases.

Deploy as a REST wrapper for OpenWeatherMap.

🛠️ Getting Started
✅ Prerequisites
Java 17+

Maven

A free OpenWeatherMap account with an API key

🚀 To run the application:
bash
Copy
Edit
./mvnw spring-boot:run
Or if using IntelliJ or VS Code:

Click the run button on RestApiClientApplication.

📝 Code Highlights
java
Copy
Edit
HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
connection.setRequestMethod("GET");
BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
StringBuilder response = new StringBuilder();
while ((line = reader.readLine()) != null) response.append(line);
WeatherResponse weather = gson.fromJson(response.toString(), WeatherResponse.class);
✅ This is the heart of calling the API, reading JSON, and parsing it into Java objects.

🎯 Summary
This project gives you a hands-on, end-to-end example of:

🚀 Calling external REST APIs from Java

🔍 Parsing JSON cleanly into Java POJOs

⚙ Running a Spring Boot app purely as a console utility

📈 Building skills that lead directly into microservices, data pipelines, and cloud integrations.
