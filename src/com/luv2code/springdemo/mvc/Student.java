package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favLang;
	private String os;
	

	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private LinkedHashMap<String, String> osOptions;
	
	public Student() {
		
		osOptions = new LinkedHashMap();
		
		osOptions.put("MacOS", "MacOS");
		osOptions.put("Windows", "Windows");
		countryOptions = new LinkedHashMap();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("GE", "Germany");
		
		favoriteLanguageOptions = new LinkedHashMap<>();

		// parameter order: value, display label
		//
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");
	}
	
	
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}



	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}



	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	
	public String getOs() {
		return os;
	}



	public void setOs(String os) {
		this.os = os;
	}



	public LinkedHashMap<String, String> getOsOptions() {
		return osOptions;
	}
	
	
}
