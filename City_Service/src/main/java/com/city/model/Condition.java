package com.city.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Condition {
	
	private String text;
	private String icon;
	private int code;

}
