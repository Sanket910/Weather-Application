package com.city.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.city.model.Weather;

@FeignClient(name = "weather-service")
public interface WeatherService {
	
	/**
	 * get weather information from weather microservice by location(city name).
	 * 
	 * @param location
	 * @return {@link Weather}
	 */
	@GetMapping("weather/{location}")
	public Weather GetWeather(@PathVariable("location") String location);

}
