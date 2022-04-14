package com.city.model;

import java.util.List;

public class Forecast {

	private List<Forecastday> forecastday;

	public Forecast(List<Forecastday> forecastday) {
		super();
		this.forecastday = forecastday;
	}

	public Forecast() {
		super();
	}

	public List<Forecastday> getForecastday() {
		return forecastday;
	}

	public void setForecastday(List<Forecastday> forecastday) {
		this.forecastday = forecastday;
	}

}
