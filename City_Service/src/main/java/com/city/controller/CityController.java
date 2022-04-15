package com.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.city.dto.CityWeatherDto;
import com.city.model.City;
import com.city.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;

	/**
	 * Get Cities List
	 * 
	 * @return {@link List<CityWeatherDto>}
	 */
	@GetMapping("")
	public List<CityWeatherDto> getCityList() {

		return cityService.getCityList();
	}

	/**
	 * Save city into Database
	 * 
	 * @param city
	 * @return {@link ResponseEntity<String>}
	 */
	@PostMapping("")
	public ResponseEntity<String> saveCity(@RequestBody City city) {

		return new ResponseEntity<String>(cityService.saveCity(city), HttpStatus.OK);
	}

	/**
	 * Delete city by id
	 * 
	 * @param id
	 * @return {@link String}
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCity(@PathVariable("id") long id) {

		cityService.deleteCity(id);
		return new ResponseEntity<String>("City Deleated..!", HttpStatus.OK);
	}

	/**
	 * Update sort order in list of cities
	 * 
	 * @param List<City>
	 * @return {@link String}
	 */
	@PostMapping("/saveSortList")
	public ResponseEntity<String> saveSortList(@RequestBody List<CityWeatherDto> cityList) {

		cityService.saveSortList(cityList);
		return new ResponseEntity<String>("list updated..!", HttpStatus.OK);
	}

}
