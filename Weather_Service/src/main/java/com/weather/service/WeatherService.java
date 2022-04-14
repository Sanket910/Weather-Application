package com.weather.service;

import com.weather.model.Weather;

public interface WeatherService {

	/**
	 * Get Weather information By location
	 * 
	 * @param location
	 * @return {@link Weather}
	 */
	Weather GetWeatherByCityName(String location);

}
