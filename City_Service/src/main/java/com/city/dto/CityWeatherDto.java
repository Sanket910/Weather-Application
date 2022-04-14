package com.city.dto;



public class CityWeatherDto {

	private Long id;
	private String cityName;
	private int sortId;
	private String weatherType;
	private double maxtempC;
	private double mintempC;

	

	@Override
	public String toString() {
		return "CityWeatherDto [id=" + id + ", cityName=" + cityName + ", sortId=" + sortId + ", weatherType="
				+ weatherType + ", maxtempC=" + maxtempC + ", mintempC=" + mintempC + "]";
	}

	public CityWeatherDto() {
		super();
	}

	public CityWeatherDto(Long id, String cityName, int sortId, String weatherType, double maxtempC, double mintempC) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.sortId = sortId;
		this.weatherType = weatherType;
		this.maxtempC = maxtempC;
		this.mintempC = mintempC;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getSortId() {
		return sortId;
	}

	public void setSortId(int sortId) {
		this.sortId = sortId;
	}

	public String getWeatherType() {
		return weatherType;
	}

	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}

	public double getMaxtempC() {
		return maxtempC;
	}

	public void setMaxtempC(double maxtempC) {
		this.maxtempC = maxtempC;
	}

	public double getMintempC() {
		return mintempC;
	}

	public void setMintempC(double mintempC) {
		this.mintempC = mintempC;
	}

	
}
