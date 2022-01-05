package com.company.designpattern.factory.simple;

public class SimplePizzaFactory {

	public enum pizzaType {
		CHEESE,
		CORN,
		VEGGIE
	}
	
	/**
	 * A simple factory pattern implemented statically
	 * @param type
	 * @return
	 */
	public static Pizza createPizza(SimplePizzaFactory.pizzaType type) {
		if(type.equals(pizzaType.CHEESE)) {
			return new CheesePizza();
		}else if(type.equals(pizzaType.CORN)) {
			return new CornPizza();
		}else if(type.equals(pizzaType.VEGGIE)) {
			return new VeggiePizza();
		}else {
			return null;
		}
	}
	
}
