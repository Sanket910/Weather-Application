package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
