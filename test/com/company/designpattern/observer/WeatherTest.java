package com.company.designpattern.observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeatherTest {

	@Test
	void test() {
		Subject weatherStation = new WeatherStation();
		Observer observer1 = new WeatherDisplay();
		Observer observer2 = new WeatherDisplay();
		weatherStation.register(observer1);
		weatherStation.register(observer1);
		weatherStation.setWeatherData("Temperature : 25 , Humidity: 60%");
	}

}
