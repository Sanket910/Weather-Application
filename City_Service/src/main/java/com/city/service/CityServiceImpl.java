package com.city.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.city.dao.CityRepository;
import com.city.dto.CityWeatherDto;
import com.city.exception.GenericException;
import com.city.model.City;
import com.city.model.Weather;

import feign.FeignException.FeignClientException;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private WeatherService weatherService;

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private NextSequenceService nextSequenceService;

	/**
	 * Get Cities List
	 * 
	 * @return {@link List<CityWeatherDto>}
	 */
	@Override
	public List<CityWeatherDto> getCityList() {

		List<CityWeatherDto> cityWeatherDto = cityRepository.findAll().stream()
				.sorted(Comparator.comparing(City::getSortId)).map(city -> modelMapper.map(city, CityWeatherDto.class))
				.collect(Collectors.toList());
		cityWeatherDto = getWeatherInfo(cityWeatherDto);

		return cityWeatherDto;
	}

	/**
	 * Get weather information by using city name
	 * 
	 * @param List<CityWeatherDto>
	 * @return {@link List<CityWeatherDto>}
	 */
	private List<CityWeatherDto> getWeatherInfo(List<CityWeatherDto> cityWeatherDto) {

		for (CityWeatherDto cityWeatherDtoTemp : cityWeatherDto) {
			
			Weather weather = weatherService.GetWeather(cityWeatherDtoTemp.getCityName());
			cityWeatherDtoTemp.setMaxtempC(weather.getForecast().getForecastday().get(0).getDay().getMaxtempC());
			cityWeatherDtoTemp.setMintempC(weather.getForecast().getForecastday().get(0).getDay().getMintempC());
			cityWeatherDtoTemp
					.setWeatherType(weather.getForecast().getForecastday().get(0).getDay().getCondition().getText());
		}

		return cityWeatherDto;
	}

	/**
	 * Save city into Database
	 * 
	 * @param city
	 * @return {@link String}
	 */
	@Override
	public String saveCity(City city) {

		try {
			
			Weather weather = weatherService.GetWeather(city.getCityName());
			if (cityRepository.findByCityName(city.getCityName()) == null  && weather.getCurrent()!=null && weather.getForecast()!=null) {

				city.setId(nextSequenceService.getNextSequence("customSequences"));
				cityRepository.save(city);
			} else {

				throw new GenericException("City is previously added, select another city..!");
			}
		} catch (FeignClientException e) {
			
			throw new GenericException("Desired city is not supported by weather Api...!");
		}

		return "City Added Succesfully..!";
	}

	/**
	 * Delete city by id
	 * 
	 * @param id
	 * @return {@link String}
	 */
	@Override
	public String deleteCity(long id) {
		
		if(cityRepository.findById(id)!=null) {
			
			cityRepository.deleteById(id);
		}else {
			
			throw new GenericException("City is not present in database");
		}
		
		return "City Deleated Successfully..!";
	}

	/**
	 * Update sort order in list of cities
	 * 
	 * @param List<CityWeatherDto>
	 */
	@Override
	public void saveSortList(List<CityWeatherDto> cityListDto) {

		List<City> cityList = cityListDto.stream().map(city -> modelMapper.map(city, City.class))
				.collect(Collectors.toList());
		int count = 1;
		for (City tempCity : cityList) {

			tempCity.setSortId(count);
			cityRepository.save(tempCity);
			count++;
		}
	}

}
