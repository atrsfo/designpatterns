package com.company.designpattern.observer;

public interface Subject {

	public void register(Observer observer);
	
	public void deregister(Observer observer);
	
	public void notifyChange();
	
	public void setWeatherData(String weatherData);
	
}
