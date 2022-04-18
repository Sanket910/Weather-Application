package com.city.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Astro {
	
	private String sunrise;
	private String sunset;
	private String moonrise;
	private String moonset;
	@JsonProperty("moon_phase")
	private String moonPhase;
	@JsonProperty("moon_illumination")
	private String moonIllumination;
	
	
	

}
