package com.company.designpattern.factory.abstrct;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();
		if(type.equals("Cheese")) {
			return new CheesePizza(pizzaIngredientFactory);
		}else if(type.equals("Veggie")) {
			return new VeggiePizza(pizzaIngredientFactory);
		}
		return null;
	}

}
