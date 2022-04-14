package com.city.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Astro {
	
	private String sunrise;
	private String sunset;
	private String moonrise;
	private String moonset;
	@JsonProperty("moon_phase")
	private String moonPhase;
	@JsonProperty("moon_illumination")
	private String moonIllumination;
	
	public Astro() {
		super();
	}
	
	public Astro(String sunrise, String sunset, String moonrise, String moonset, String moonPhase,
			String moonIllumination) {
		super();
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.moonrise = moonrise;
		this.moonset = moonset;
		this.moonPhase = moonPhase;
		this.moonIllumination = moonIllumination;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getMoonrise() {
		return moonrise;
	}

	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}

	public String getMoonset() {
		return moonset;
	}

	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}

	public String getMoonPhase() {
		return moonPhase;
	}

	public void setMoonPhase(String moonPhase) {
		this.moonPhase = moonPhase;
	}

	public String getMoonIllumination() {
		return moonIllumination;
	}

	public void setMoonIllumination(String moonIllumination) {
		this.moonIllumination = moonIllumination;
	}
	
	

}
