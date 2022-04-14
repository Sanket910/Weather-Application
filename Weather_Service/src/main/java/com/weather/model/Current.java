package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
	
	@JsonProperty("last_updated_epoch")
	private int lastUpdatedEpoch;
	@JsonProperty("last_updated")
	private String lastUpdated;
	@JsonProperty("temp_c")
	private double tempC;
	@JsonProperty("temp_f")
	private double tempF;
	@JsonProperty("is_day")
	private int isDay;
	private Condition condition;
	@JsonProperty("wind_mph")
	private double windMph;
	@JsonProperty("wind_kph")
	private double windKph;
	@JsonProperty("wind_degree")
	private int windDegree;
	@JsonProperty("wind_dir")
	private String windDir;
	@JsonProperty("pressure_mb")
	private double pressureMb;
	@JsonProperty("pressure_in")
	private double pressureIN;
	@JsonProperty("precip_mm")
	private double precipMm;
	@JsonProperty("precip_in")
	private double precipIn;
	private int humidity;
	private int cloud;
	@JsonProperty("feelslike_c")
	private double feelslikeC;
	@JsonProperty("feelslike_f")
	private double feelslikeF;
	@JsonProperty("vis_km")
	private double visKm;
	@JsonProperty("vis_miles")
	private double visMiles;
	private double uv;
	@JsonProperty("gust_mph")
	private double gustMph;
	@JsonProperty("gust_kph")
	private double gustKph;
	@JsonProperty("air_quality")
	private AirQuality airQuality;
	public Current() {
		super();
	}
	public Current(int lastUpdatedEpoch, String lastUpdated, double tempC, double tempF, int isDay, Condition condition,
			double windMph, double windKph, int windDegree, String windDir, double pressureMb, double pressureIN,
			double precipMm, double precipIn, int humidity, int cloud, double feelslikeC, double feelslikeF,
			double visKm, double visMiles, double uv, double gustMph, double gustKph, AirQuality airQuality) {
		super();
		this.lastUpdatedEpoch = lastUpdatedEpoch;
		this.lastUpdated = lastUpdated;
		this.tempC = tempC;
		this.tempF = tempF;
		this.isDay = isDay;
		this.condition = condition;
		this.windMph = windMph;
		this.windKph = windKph;
		this.windDegree = windDegree;
		this.windDir = windDir;
		this.pressureMb = pressureMb;
		this.pressureIN = pressureIN;
		this.precipMm = precipMm;
		this.precipIn = precipIn;
		this.humidity = humidity;
		this.cloud = cloud;
		this.feelslikeC = feelslikeC;
		this.feelslikeF = feelslikeF;
		this.visKm = visKm;
		this.visMiles = visMiles;
		this.uv = uv;
		this.gustMph = gustMph;
		this.gustKph = gustKph;
		this.airQuality = airQuality;
	}
	public int getLastUpdatedEpoch() {
		return lastUpdatedEpoch;
	}
	public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
		this.lastUpdatedEpoch = lastUpdatedEpoch;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public double getTempC() {
		return tempC;
	}
	public void setTempC(double tempC) {
		this.tempC = tempC;
	}
	public double getTempF() {
		return tempF;
	}
	public void setTempF(double tempF) {
		this.tempF = tempF;
	}
	public int getIsDay() {
		return isDay;
	}
	public void setIsDay(int isDay) {
		this.isDay = isDay;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public double getWindMph() {
		return windMph;
	}
	public void setWindMph(double windMph) {
		this.windMph = windMph;
	}
	public double getWindKph() {
		return windKph;
	}
	public void setWindKph(double windKph) {
		this.windKph = windKph;
	}
	public int getWindDegree() {
		return windDegree;
	}
	public void setWindDegree(int windDegree) {
		this.windDegree = windDegree;
	}
	public String getWindDir() {
		return windDir;
	}
	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}
	public double getPressureMb() {
		return pressureMb;
	}
	public void setPressureMb(double pressureMb) {
		this.pressureMb = pressureMb;
	}
	public double getPressureIN() {
		return pressureIN;
	}
	public void setPressureIN(double pressureIN) {
		this.pressureIN = pressureIN;
	}
	public double getPrecipMm() {
		return precipMm;
	}
	public void setPrecipMm(double precipMm) {
		this.precipMm = precipMm;
	}
	public double getPrecipIn() {
		return precipIn;
	}
	public void setPrecipIn(double precipIn) {
		this.precipIn = precipIn;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public double getFeelslikeC() {
		return feelslikeC;
	}
	public void setFeelslikeC(double feelslikeC) {
		this.feelslikeC = feelslikeC;
	}
	public double getFeelslikeF() {
		return feelslikeF;
	}
	public void setFeelslikeF(double feelslikeF) {
		this.feelslikeF = feelslikeF;
	}
	public double getVisKm() {
		return visKm;
	}
	public void setVisKm(double visKm) {
		this.visKm = visKm;
	}
	public double getVisMiles() {
		return visMiles;
	}
	public void setVisMiles(double visMiles) {
		this.visMiles = visMiles;
	}
	public double getUv() {
		return uv;
	}
	public void setUv(double uv) {
		this.uv = uv;
	}
	public double getGustMph() {
		return gustMph;
	}
	public void setGustMph(double gustMph) {
		this.gustMph = gustMph;
	}
	public double getGustKph() {
		return gustKph;
	}
	public void setGustKph(double gustKph) {
		this.gustKph = gustKph;
	}
	public AirQuality getAirQuality() {
		return airQuality;
	}
	public void setAirQuality(AirQuality airQuality) {
		this.airQuality = airQuality;
	}
	
	

}
