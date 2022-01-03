package com.company.designpattern.decorator;

public class Whip extends Toppings {

	public Whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost() + 0.10f;
	}

}
