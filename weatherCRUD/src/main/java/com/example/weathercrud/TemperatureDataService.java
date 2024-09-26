package com.example.weathercrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class TemperatureDataService {
    private final TemperatureDataRepository temperatureDataRepository;

    //
    @Autowired
    public TemperatureDataService(TemperatureDataRepository temperatureDataRepository) {
        this.temperatureDataRepository = temperatureDataRepository;
    }

    public void generateAndSaveFakeTemperatureData() {
        // Generate random temp values between 0 - 100
        Random random = new Random();
        double fakeTemperature = random.nextDouble() * 100;

        // Save or use the fakeTemperature data here
        // You might want to store it in a field or print it, for example
        System.out.println("Generated Fake Temperature: " + fakeTemperature);
    }


    // get all stored temp data
    public List<TemperatureData> getAllTemperatureData() {
        return temperatureDataRepository.findAll();
    }
}
