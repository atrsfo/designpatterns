package com.company.designpattern.factory.abstrct;

public class VeggiePizza extends Pizza {

PizzaIngredientFactory pizzaIngredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}


	@Override
	void prepare() {
		// TODO Auto-generated method stub
		//no cheese added in veggie pizza
		
		dough = pizzaIngredientFactory.createDough();
		veggies = pizzaIngredientFactory.createVeggies();
		sauce = pizzaIngredientFactory.createSauce();
	}

}
