package com.company.designpattern.factory.method;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Cheese")) {
			return new NYCheesePizza();
		}else if(type.equals("Veggie")) {
			return new NYVeggiePizza();
		}
		return null;
	}

}
