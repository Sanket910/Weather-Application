package com.city.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.city.model.City;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.city.model.City;
//
//@Repository
//public interface CityRepository extends JpaRepository<City, Long> {
//	
//	City findByCityName(String city);
//
//}

@Repository
public interface CityRepository extends MongoRepository<City, Long> {
	
	City findByCityName(String city);

}
