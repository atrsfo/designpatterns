package com.company.designpattern.factory.method;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Cheese")) {
			return new CaliforniaCheesePizza();
		}else if(type.equals("Veggie")) {
			return new CaliforniaVeggiePizza();
		}
		return null;
	}

}
