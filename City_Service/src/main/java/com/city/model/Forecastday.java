package com.city.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Forecastday {

	private String date;
	@JsonProperty("date_epoch")
	private int dateEpoch;
	private Day day;
	private Astro astro;
	private List<Hour> hour;

	public Forecastday() {
		super();
	}

	public Forecastday(String date, int dateEpoch, Day day, Astro astro, List<Hour> hour) {
		super();
		this.date = date;
		this.dateEpoch = dateEpoch;
		this.day = day;
		this.astro = astro;
		this.hour = hour;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDateEpoch() {
		return dateEpoch;
	}

	public void setDateEpoch(int dateEpoch) {
		this.dateEpoch = dateEpoch;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Astro getAstro() {
		return astro;
	}

	public void setAstro(Astro astro) {
		this.astro = astro;
	}

	public List<Hour> getHour() {
		return hour;
	}

	public void setHour(List<Hour> hour) {
		this.hour = hour;
	}

}
