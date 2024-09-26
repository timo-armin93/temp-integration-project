package com.example.weathercrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/temperature")
public class TemperatureController {
    private final TemperatureDataService temperatureDataService;

    @Autowired
    public TemperatureController(TemperatureDataService temperatureDataService) {
        this.temperatureDataService = temperatureDataService;
    }

    @GetMapping("/generate")
    public String generateAndSaveFakeData(Model model) {

        temperatureDataService.generateAndSaveFakeTemperatureData();


        List<TemperatureData> temperatureData = temperatureDataService.getAllTemperatureData();
        model.addAttribute("temperatureData", temperatureData);

        return "temperature"; // return thymeleaf template
    }
}
