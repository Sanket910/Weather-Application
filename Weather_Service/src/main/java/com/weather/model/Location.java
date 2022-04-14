package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

	private String name;
	private String region;
	private String country;
	private double lat;
	private double lon;
	@JsonProperty("tz_id")
	private String tzId;
	@JsonProperty("localtime_epoch")
	private int localtimeEpoch;
	private String localtime;

	public Location() {
		super();
	}

	public Location(String name, String region, String country, double lat, double lon, String tzId, int localtimeEpoch,
			String localtime) {
		super();
		this.name = name;
		this.region = region;
		this.country = country;
		this.lat = lat;
		this.lon = lon;
		this.tzId = tzId;
		this.localtimeEpoch = localtimeEpoch;
		this.localtime = localtime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public String getTzId() {
		return tzId;
	}

	public void setTzId(String tzId) {
		this.tzId = tzId;
	}

	public int getLocaltimeEpoch() {
		return localtimeEpoch;
	}

	public void setLocaltimeEpoch(int localtimeEpoch) {
		this.localtimeEpoch = localtimeEpoch;
	}

	public String getLocaltime() {
		return localtime;
	}

	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}

}
