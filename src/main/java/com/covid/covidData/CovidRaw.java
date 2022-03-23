package com.covid.covidData;

import java.io.Serializable;

public class CovidRaw implements Serializable {
	
	private int iso_code;	
	private String continent;
	private String location;
	private int total_cases;
	private int new_cases;
	public int getIso_code() {
		return iso_code;
	}
	public void setIso_code(int iso_code) {
		this.iso_code = iso_code;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotal_cases() {
		return total_cases;
	}
	public void setTotal_cases(int total_cases) {
		this.total_cases = total_cases;
	}
	public int getNew_cases() {
		return new_cases;
	}
	public void setNew_cases(int new_cases) {
		this.new_cases = new_cases;
	}	
	
	
	

	
}
