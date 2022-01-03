package com.company.designpattern.decorator;

public class Chocolate extends Toppings {

	public Chocolate(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost()+0.20f;
	}

}
