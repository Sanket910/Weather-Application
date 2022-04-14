package com.city.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day {
	@JsonProperty("maxtemp_c")
	private double maxtempC;
	@JsonProperty("maxtemp_f")
	private double maxtempF;
	@JsonProperty("mintemp_c")
	private double mintempC;
	@JsonProperty("mintemp_f")
	private double mintempF;
	@JsonProperty("avgtemp_c")
	private double avgtempC;
	@JsonProperty("avgtemp_f")
	private double avgtempF;
	@JsonProperty("maxwind_mph")
	private double maxwindMph;
	@JsonProperty("maxwind_kph")
	private double maxwindKph;
	@JsonProperty("totalprecip_mm")
	private double totalprecipMm;
	@JsonProperty("totalprecip_in")
	private double totalprecipIn;
	@JsonProperty("avgvis_km")
	private double avgvisKm;
	@JsonProperty("avgvis_miles")
	private double avgvisMiles;
	private double avghumidity;
	@JsonProperty("daily_will_it_rain")
	private int dailyWillItRain;
	@JsonProperty("daily_chance_of_rain")
	private int dailyChanceOfRain;
	@JsonProperty("daily_will_it_snow")
	private int dailyWillItSnow;
	@JsonProperty("daily_chance_of_snow")
	private int dailyChanceOfSnow;
	private Condition condition;
	private double uv;

	public Day() {
		super();
	}

	public Day(double maxtempC, double maxtempF, double mintempC, double mintempF, double avgtempC, double avgtempF,
			double maxwindMph, double maxwindKph, double totalprecipMm, double totalprecipIn, double avgvisKm,
			double avgvisMiles, double avghumidity, int dailyWillItRain, int dailyChanceOfRain, int dailyWillItSnow,
			int dailyChanceOfSnow, Condition condition, double uv) {
		super();
		this.maxtempC = maxtempC;
		this.maxtempF = maxtempF;
		this.mintempC = mintempC;
		this.mintempF = mintempF;
		this.avgtempC = avgtempC;
		this.avgtempF = avgtempF;
		this.maxwindMph = maxwindMph;
		this.maxwindKph = maxwindKph;
		this.totalprecipMm = totalprecipMm;
		this.totalprecipIn = totalprecipIn;
		this.avgvisKm = avgvisKm;
		this.avgvisMiles = avgvisMiles;
		this.avghumidity = avghumidity;
		this.dailyWillItRain = dailyWillItRain;
		this.dailyChanceOfRain = dailyChanceOfRain;
		this.dailyWillItSnow = dailyWillItSnow;
		this.dailyChanceOfSnow = dailyChanceOfSnow;
		this.condition = condition;
		this.uv = uv;
	}

	public double getMaxtempC() {
		return maxtempC;
	}

	public void setMaxtempC(double maxtempC) {
		this.maxtempC = maxtempC;
	}

	public double getMaxtempF() {
		return maxtempF;
	}

	public void setMaxtempF(double maxtempF) {
		this.maxtempF = maxtempF;
	}

	public double getMintempC() {
		return mintempC;
	}

	public void setMintempC(double mintempC) {
		this.mintempC = mintempC;
	}

	public double getMintempF() {
		return mintempF;
	}

	public void setMintempF(double mintempF) {
		this.mintempF = mintempF;
	}

	public double getAvgtempC() {
		return avgtempC;
	}

	public void setAvgtempC(double avgtempC) {
		this.avgtempC = avgtempC;
	}

	public double getAvgtempF() {
		return avgtempF;
	}

	public void setAvgtempF(double avgtempF) {
		this.avgtempF = avgtempF;
	}

	public double getMaxwindMph() {
		return maxwindMph;
	}

	public void setMaxwindMph(double maxwindMph) {
		this.maxwindMph = maxwindMph;
	}

	public double getMaxwindKph() {
		return maxwindKph;
	}

	public void setMaxwindKph(double maxwindKph) {
		this.maxwindKph = maxwindKph;
	}

	public double getTotalprecipMm() {
		return totalprecipMm;
	}

	public void setTotalprecipMm(double totalprecipMm) {
		this.totalprecipMm = totalprecipMm;
	}

	public double getTotalprecipIn() {
		return totalprecipIn;
	}

	public void setTotalprecipIn(double totalprecipIn) {
		this.totalprecipIn = totalprecipIn;
	}

	public double getAvgvisKm() {
		return avgvisKm;
	}

	public void setAvgvisKm(double avgvisKm) {
		this.avgvisKm = avgvisKm;
	}

	public double getAvgvisMiles() {
		return avgvisMiles;
	}

	public void setAvgvisMiles(double avgvisMiles) {
		this.avgvisMiles = avgvisMiles;
	}

	public double getAvghumidity() {
		return avghumidity;
	}

	public void setAvghumidity(double avghumidity) {
		this.avghumidity = avghumidity;
	}

	public int getDailyWillItRain() {
		return dailyWillItRain;
	}

	public void setDailyWillItRain(int dailyWillItRain) {
		this.dailyWillItRain = dailyWillItRain;
	}

	public int getDailyChanceOfRain() {
		return dailyChanceOfRain;
	}

	public void setDailyChanceOfRain(int dailyChanceOfRain) {
		this.dailyChanceOfRain = dailyChanceOfRain;
	}

	public int getDailyWillItSnow() {
		return dailyWillItSnow;
	}

	public void setDailyWillItSnow(int dailyWillItSnow) {
		this.dailyWillItSnow = dailyWillItSnow;
	}

	public int getDailyChanceOfSnow() {
		return dailyChanceOfSnow;
	}

	public void setDailyChanceOfSnow(int dailyChanceOfSnow) {
		this.dailyChanceOfSnow = dailyChanceOfSnow;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public double getUv() {
		return uv;
	}

	public void setUv(double uv) {
		this.uv = uv;
	}

}