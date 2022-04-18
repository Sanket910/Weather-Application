package com.city.service;

import java.util.List;

import com.city.dto.CityWeatherDto;
import com.city.model.City;

public interface CityService {
	

	/**
	 * Get Cities List
	 * 
	 * @return {@link List<CityWeatherDto>}
	 */
	List<CityWeatherDto> getCityList();

	/**
	 * Save city into Database
	 * 
	 * @param city
	 * @return {@link String}
	 */
	String saveCity(City city);

	/**
	 * Delete city by id
	 * 
	 * @param id
	 * @return {@link String}
	 */
	String deleteCity(long id);

	/**
	 * Update sort order in list of cities
	 * 
	 * @param List<City>
	 * @return {@link String}
	 */
	void saveSortList(List<CityWeatherDto> cityList);

}
