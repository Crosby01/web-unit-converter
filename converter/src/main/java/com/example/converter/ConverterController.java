package com.example.converter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
@CrossOrigin
public class ConverterController {

    @GetMapping("/")
    public String home() {
        return "Unit Converter Backend is running";
    }

    @GetMapping("/length")
    public String convertLength(
            @RequestParam double value,
            @RequestParam String from,
            @RequestParam String to
    ) {

        double meters;

        switch (from) {
            case "m":
                meters = value;
                break;

            case "cm":
                meters = value / 100;
                break;

            case "ft":
                meters = value * 0.3048;
                break;

            default:
                return "Invalid from unit";
        }

        double result;

        switch (to) {
            case "m":
                result = meters;
                break;

            case "cm":
                result = meters * 100;
                break;

            case "ft":
                result = meters / 0.3048;
                break;

            default:
                return "Invalid to unit";
        }

        return value + " " + from + " = " + result + " " + to;
    }


    @GetMapping("/weight")
    public String convertWeight(
            @RequestParam double value,
            @RequestParam String from,
            @RequestParam String to
    ) {
    
        double kg;
    
        switch (from) {
            case "kg":
                kg = value;
                break;
    
            case "g":
                kg = value / 1000;
                break;
    
            case "lb":
                kg = value * 0.453592;
                break;
    
            default:
                return "Invalid weight unit";
        }
    
        double result;
    
        switch (to) {
            case "kg":
                result = kg;
                break;
    
            case "g":
                result = kg * 1000;
                break;
    
            case "lb":
                result = kg / 0.453592;
                break;
    
            default:
                return "Invalid weight unit";
        }
    
        return value + " " + from + " = " + result + " " + to;
    }


    @GetMapping("/temperature")
    public String convertTemperature(
            @RequestParam double value,
            @RequestParam String from,
            @RequestParam String to
    ) {
    
        double celsius;
    
        switch (from) {
            case "c":
                celsius = value;
                break;
    
            case "f":
                celsius = (value - 32) * 5 / 9;
                break;
    
            case "k":
                celsius = value - 273.15;
                break;
    
            default:
                return "Invalid temperature unit";
        }
    
        double result;
    
        switch (to) {
            case "c":
                result = celsius;
                break;
    
            case "f":
                result = (celsius * 9 / 5) + 32;
                break;
    
            case "k":
                result = celsius + 273.15;
                break;
    
            default:
                return "Invalid temperature unit";
        }
    
        return value + " " + from + " = " + result + " " + to;
    }

}
