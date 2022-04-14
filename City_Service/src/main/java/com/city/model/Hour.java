package com.city.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hour {
	@JsonProperty("time_epoch")
	private int timeEpoch;
	private String time;
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
	private double pressureIn;
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
	@JsonProperty("windchill_c")
	private double windchillC;
	@JsonProperty("windchill_f")
	private double windchillF;
	@JsonProperty("heatindex_c")
	private double heatindexC;
	@JsonProperty("heatindex_f")
	private double heatindexF;
	@JsonProperty("dewpoint_c")
	private double dewpointC;
	@JsonProperty("dewpoint_f")
	private double dewpointF;
	@JsonProperty("will_it_rain")
	private int willItRain;
	@JsonProperty("chance_of_rain")
	private int chanceOfRain;
	@JsonProperty("will_it_snow")
	private int willItSnow;
	@JsonProperty("chance_of_snow")
	private int chanceOfSnow;
	@JsonProperty("vis_km")
	private double visKm;
	@JsonProperty("vis_miles")
	private double visMiles;
	@JsonProperty("gust_mph")
	private double gustMph;
	@JsonProperty("gust_kph")
	private double gustKph;
	private double uv;

	public Hour() {
		super();
	}

	public Hour(int timeEpoch, String time, double tempC, double tempF, int isDay, Condition condition, double windMph,
			double windKph, int windDegree, String windDir, double pressureMb, double pressureIn, double precipMm,
			double precipIn, int humidity, int cloud, double feelslikeC, double feelslikeF, double windchillC,
			double windchillF, double heatindexC, double heatindexF, double dewpointC, double dewpointF, int willItRain,
			int chanceOfRain, int willItSnow, int chanceOfSnow, double visKm, double visMiles, double gustMph,
			double gustKph, double uv) {
		super();
		this.timeEpoch = timeEpoch;
		this.time = time;
		this.tempC = tempC;
		this.tempF = tempF;
		this.isDay = isDay;
		this.condition = condition;
		this.windMph = windMph;
		this.windKph = windKph;
		this.windDegree = windDegree;
		this.windDir = windDir;
		this.pressureMb = pressureMb;
		this.pressureIn = pressureIn;
		this.precipMm = precipMm;
		this.precipIn = precipIn;
		this.humidity = humidity;
		this.cloud = cloud;
		this.feelslikeC = feelslikeC;
		this.feelslikeF = feelslikeF;
		this.windchillC = windchillC;
		this.windchillF = windchillF;
		this.heatindexC = heatindexC;
		this.heatindexF = heatindexF;
		this.dewpointC = dewpointC;
		this.dewpointF = dewpointF;
		this.willItRain = willItRain;
		this.chanceOfRain = chanceOfRain;
		this.willItSnow = willItSnow;
		this.chanceOfSnow = chanceOfSnow;
		this.visKm = visKm;
		this.visMiles = visMiles;
		this.gustMph = gustMph;
		this.gustKph = gustKph;
		this.uv = uv;
	}

	public int getTimeEpoch() {
		return timeEpoch;
	}

	public void setTimeEpoch(int timeEpoch) {
		this.timeEpoch = timeEpoch;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public double getPressureIn() {
		return pressureIn;
	}

	public void setPressureIn(double pressureIn) {
		this.pressureIn = pressureIn;
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

	public double getWindchillC() {
		return windchillC;
	}

	public void setWindchillC(double windchillC) {
		this.windchillC = windchillC;
	}

	public double getWindchillF() {
		return windchillF;
	}

	public void setWindchillF(double windchillF) {
		this.windchillF = windchillF;
	}

	public double getHeatindexC() {
		return heatindexC;
	}

	public void setHeatindexC(double heatindexC) {
		this.heatindexC = heatindexC;
	}

	public double getHeatindexF() {
		return heatindexF;
	}

	public void setHeatindexF(double heatindexF) {
		this.heatindexF = heatindexF;
	}

	public double getDewpointC() {
		return dewpointC;
	}

	public void setDewpointC(double dewpointC) {
		this.dewpointC = dewpointC;
	}

	public double getDewpointF() {
		return dewpointF;
	}

	public void setDewpointF(double dewpointF) {
		this.dewpointF = dewpointF;
	}

	public int getWillItRain() {
		return willItRain;
	}

	public void setWillItRain(int willItRain) {
		this.willItRain = willItRain;
	}

	public int getChanceOfRain() {
		return chanceOfRain;
	}

	public void setChanceOfRain(int chanceOfRain) {
		this.chanceOfRain = chanceOfRain;
	}

	public int getWillItSnow() {
		return willItSnow;
	}

	public void setWillItSnow(int willItSnow) {
		this.willItSnow = willItSnow;
	}

	public int getChanceOfSnow() {
		return chanceOfSnow;
	}

	public void setChanceOfSnow(int chanceOfSnow) {
		this.chanceOfSnow = chanceOfSnow;
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

	public double getUv() {
		return uv;
	}

	public void setUv(double uv) {
		this.uv = uv;
	}

}
