package com.company.designpattern.factory.abstrct;

public class NyPizzaStore extends PizzaStore {

	
	
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();
		if(type.equals("Cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("NY Style Cheese Pizza");
		}else if(type.equals("Veggie")) {
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("NY Style Veggie Pizza");
		}
		return pizza;
	}

}
