package com.weather.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.weather.exception.GenericException;
import com.weather.model.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {
	
	/**
	 * Get Weather information By location
	 * 
	 * @param location
	 * @return {@link Weather}
	 */
	@Override
	public Weather GetWeatherByCityName(String location) {
		
		try {
//			String baseurl="http://api.weatherapi.com/v1/forecast.json?";
//			String key ="key=483a04daff914ce58f991903220803";
//			String location1 ="&q=";
//			String day="&days=7";
//			String aqi="&aqi=yes";
//			String alert="&alerts=no";
			RestTemplate restTemplate = new RestTemplate();
			
			return restTemplate.getForObject("http://api.weatherapi.com/v1/forecast.json?key=483a04daff914ce58f991903220803&q="+location+"&days=7&aqi=yes&alerts=no" ,Weather.class );
		} catch (RestClientException e) {
			
			throw new GenericException("Desired city is not supported by weather Api...!");
		}
	}

}
