package com.company.designpattern.factory.method;

public abstract class PizzaStore {

	
	public Pizza orderPizza(String type){
		
		Pizza pizza = createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.parcel();
		return pizza;
		
	}
	
	

	public abstract Pizza createPizza(String type); 
}
