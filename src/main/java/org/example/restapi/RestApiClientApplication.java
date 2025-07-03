package org.example.restapi;

import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class RestApiClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestApiClientApplication.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            String city = "Delhi";
            String apiKey = "33080404ca9f9c5ee0e61895aede6405"; // 🔑 Replace with your actual OpenWeatherMap API key
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                    "&appid=" + apiKey + "&units=metric";

            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) response.append(line);
            reader.close();

            // Parse JSON using Gson
            Gson gson = new Gson();
            WeatherResponse weather = gson.fromJson(response.toString(), WeatherResponse.class);

            System.out.println("City: " + weather.name);
            System.out.println("Temperature: " + weather.main.temp + "°C");
            System.out.println("Humidity: " + weather.main.humidity + "%");
            System.out.println("Weather: " + weather.weather[0].description);

        } catch (Exception e) {
            System.out.println("Error fetching weather: " + e.getMessage());
        }
    }

    // Simple classes inside the main file to reduce file count
    static class WeatherResponse {
        String name;
        Main main;
        Weather[] weather;
    }

    static class Main {
        double temp;
        int humidity;
    }

    static class Weather {
        String description;
    }
}
