<img width="1319" alt="Screenshot 2025-07-04 at 3 46 01 PM" src="https://github.com/user-attachments/assets/4eb2e125-9dbc-4d4a-8d6c-e6dd26f37be2" />


<h1 style="color:#2c3e50;">🌦 Java Spring Boot Weather REST API Client</h1>

<p>
<strong>COMPANY:</strong> CODTECH IT SOLUTIONS<br>
<strong>NAME:</strong> Sidhi Grover<br>
<strong>INTERN ID:</strong> CT06DF949<br>
<strong>DOMAIN:</strong> Java Programming<br>
<strong>DURATION:</strong> 6 Weeks<br>
<strong>MENTOR:</strong> Neela Santosh
</p>

<h2 style="color:#2980b9;">📚 Description</h2>

<p>
This project is a <strong>Java Spring Boot console-based REST API client</strong> that fetches current weather data for a city (Delhi) using the <strong>OpenWeatherMap API</strong>.
</p>

<ul>
<li>Performs <strong>HTTP GET requests</strong> to external REST APIs.</li>
<li>Parses <strong>JSON responses</strong> into Java objects using Gson.</li>
<li>Handles exceptions gracefully and prints structured data to the console.</li>
</ul>

<p>This builds a strong foundation for understanding how to integrate external web services into Java applications, crucial for microservices or cloud-connected apps.</p>

<h2 style="color:#27ae60;">⚙ How It Works</h2>

<h3>🚀 Application (RestApiClientApplication.java)</h3>

<ul>
<li>✅ Executes via <code>CommandLineRunner</code> on startup (no HTTP server).</li>
<li>✅ Builds a URL for OpenWeatherMap with city, API key, and Celsius units.</li>
<li>✅ Sends a GET request via <code>HttpURLConnection</code>.</li>
<li>✅ Reads JSON response with a <code>BufferedReader</code>.</li>
</ul>

<h3>🔍 JSON Parsing</h3>

<ul>
<li>✅ Uses <strong>Gson</strong> to parse JSON into POJOs (<code>WeatherResponse</code>, <code>Main</code>, <code>Weather</code>).</li>
<li>✅ Extracts and prints city, temperature, humidity, and weather description.</li>
</ul>

<pre>
City: Delhi
Temperature: 32.5°C
Humidity: 45%
Weather: clear sky
</pre>

<h2 style="color:#8e44ad;">🏗 Architecture</h2>

<pre style="background:#f8f8f8; padding:10px; border-radius:8px;">
+--------------------------+
| Spring Boot CLI App      |
| (CommandLineRunner)      |
+-----------+--------------+
            |
            v
+--------------------------+
| HTTP GET to OpenWeather  |
| using HttpURLConnection |
+-----------+--------------+
            |
            v
+--------------------------+
| JSON response received   |
+-----------+--------------+
            |
            v
+--------------------------+
| Parsed by Gson into POJOs|
| (WeatherResponse, etc.)  |
+-----------+--------------+
            |
            v
+--------------------------+
| Printed to Console       |
+--------------------------+
</pre>

<h2 style="color:#d35400;">✨ Why This Is Useful</h2>

<ul>
<li>🧠 Teaches <strong>REST API integration in Java</strong>.</li>
<li>🔍 Demonstrates JSON parsing into Java POJOs with Gson.</li>
<li>🚀 Builds a <strong>Spring Boot console app</strong>, handy for CLI tools or microservice jobs.</li>
<li>🔥 Lays foundation for accepting dynamic inputs, storing results, or creating an API wrapper.</li>
</ul>

<h2 style="color:#16a085;">🛠 Getting Started</h2>

<h3>✅ Prerequisites</h3>

<ul>
<li>Java 17+</li>
<li>Maven</li>
<li>A free OpenWeatherMap API key</li>
</ul>

<h3>🚀 Run the application</h3>

<pre><code>./mvnw spring-boot:run</code></pre>

Or run <code>RestApiClientApplication</code> from your IDE.

<h2 style="color:#c0392b;">📝 Code Highlights</h2>

<pre style="background:#f0f0f0; padding:10px; border-radius:6px;">
HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
connection.setRequestMethod("GET");

BufferedReader reader = new BufferedReader(
    new InputStreamReader(connection.getInputStream())
);

StringBuilder response = new StringBuilder();
String line;
while ((line = reader.readLine()) != null) {
    response.append(line);
}
reader.close();

Gson gson = new Gson();
WeatherResponse weather = gson.fromJson(response.toString(), WeatherResponse.class);
</pre>

<h2 style="color:#7f8c8d;">🎯 Summary</h2>

<p>
This project provides end-to-end practice with calling REST APIs, parsing JSON, and building a Spring Boot console utility — preparing you for microservices and data consumers.
</p>
