package com.company.designpattern.factory.abstrct;

public abstract class Pizza {
	
	Dough dough;
	Sauce sauce;
	Veggies veggies;
	Cheese cheese;
	
	String name;
	
	abstract void prepare();
	

	public void parcel() {
		// TODO Auto-generated method stub
		System.out.println("Parceling the pizza in a box");
	}

	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting the pizza");
	}

	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baking the pizza");
	}


	public void setName(String name) {
		this.name = name;
		
	}



}
