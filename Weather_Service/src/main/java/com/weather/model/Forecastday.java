package com.weather.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Forecastday {

	private String date;
	@JsonProperty("date_epoch")
	private int dateEpoch;
	private Day day;
	private Astro astro;
	private List<Hour> hour;


}
