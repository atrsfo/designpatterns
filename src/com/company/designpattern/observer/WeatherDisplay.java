package com.company.designpattern.observer;

public class WeatherDisplay implements Observer {

	
	public void update(String weatherData) {
		// TODO Auto-generated method stub
		System.out.println("Weather has changed to "+ weatherData);
	}

}
