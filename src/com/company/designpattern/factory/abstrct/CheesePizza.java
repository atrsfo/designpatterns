package com.company.designpattern.factory.abstrct;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	
	
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}



	@Override
	void prepare() {
		// TODO Auto-generated method stub
		dough = pizzaIngredientFactory.createDough();
		cheese = pizzaIngredientFactory.createCheese();
		veggies = pizzaIngredientFactory.createVeggies();
		sauce = pizzaIngredientFactory.createSauce();
	}

}
