package com.company.designpattern.factory.abstrct;

public abstract class PizzaStore {

	
	public void orderPizza(String type){
		
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.parcel();
		
	}
	
	

	public abstract Pizza createPizza(String type); 
}
