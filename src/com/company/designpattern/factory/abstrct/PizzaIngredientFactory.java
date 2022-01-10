package com.company.designpattern.factory.abstrct;

public abstract class PizzaIngredientFactory {
	
	public abstract Dough createDough();
	public abstract Sauce createSauce();
	public abstract Cheese createCheese();
	public abstract Veggies createVeggies();
	

}
