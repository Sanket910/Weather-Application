package com.city.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "citySequences")
public class CitySequence {
	
	 	@Id
	    private String id;
	    private Long seq;


}
