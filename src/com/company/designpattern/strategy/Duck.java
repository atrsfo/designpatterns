package com.company.designpattern.strategy;

public class Duck {
	
	FlyBehavior flyBehavior;

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		// TODO Auto-generated method stub
		this.flyBehavior = flyBehavior;
	}

	public void performFly() {
		// TODO Auto-generated method stub
		flyBehavior.fly();
	}

	
	
	
}
