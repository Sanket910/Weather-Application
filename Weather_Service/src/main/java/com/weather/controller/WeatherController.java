package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.model.Weather;
import com.weather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	/**
	 * Get Weather information By location
	 * 
	 * @param location
	 * @return {@link Weather}
	 */
	@GetMapping("/{location}")
	public Weather GetWeather(@PathVariable("location") String location) {

		return weatherService.GetWeatherByCityName(location);
	}

}
