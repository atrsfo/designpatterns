package com.company.designpattern.decorator;

public class Soy extends Toppings{

	
	
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		super(beverage);
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost() + 0.15f;
	}

}
