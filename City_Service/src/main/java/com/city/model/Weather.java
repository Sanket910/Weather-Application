package com.city.model;

public class Weather {
	
	private Location location;
	private Current current;
	private Forecast forecast;

	public Weather(Location location, Current current, Forecast forecast) {
		super();
		this.location = location;
		this.current = current;
		this.forecast = forecast;
	}

	public Weather() {
		super();
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

	public Forecast getForecast() {
		return forecast;
	}

	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}

}
