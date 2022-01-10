package com.company.designpattern.factory.abstrct;

public class CaliforniaPizzaIngredientFactory extends PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickDough();
	}

	

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new BlackSauce();
	}

	
	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Veggies createVeggies() {
		// TODO Auto-generated method stub
		return new FrozenVeggies();
	}

	
	

}
