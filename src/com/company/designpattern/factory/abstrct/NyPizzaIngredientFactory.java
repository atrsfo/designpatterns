package com.company.designpattern.factory.abstrct;

public class NyPizzaIngredientFactory extends PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new WhiteSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozarellaCheese();
	}

	@Override
	public Veggies createVeggies() {
		// TODO Auto-generated method stub
		return new FreshVeggies();
	}

	
}
