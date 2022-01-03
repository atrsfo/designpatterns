package com.company.designpattern.decorator;

public abstract class Toppings extends Beverage {

	Beverage beverage ;

	public Toppings(Beverage beverage) {
		super();
		this.beverage = beverage;
	} 
	
	
}
