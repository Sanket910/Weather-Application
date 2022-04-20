package com.city.model;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
	
	@Id
	private Long id;
	
	private String cityName;
	
	private int sortId;


}
