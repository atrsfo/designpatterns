package com.company.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	List<Observer> observers;
	private String weatherData;
	
	
	public WeatherStation() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}

	@Override
	public void deregister(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
	}

	@Override
	public void notifyChange() {
		// TODO Auto-generated method stub
		for(Observer observer: observers) {
			 observer.update(weatherData);
		}
	}
	
	public void setWeatherData(String weatherData){
		this.weatherData = weatherData;
		this.notifyChange();
	}
	
	

}
