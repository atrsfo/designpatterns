package com.company.designpattern.factory.method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactoryMethodTest {

	private static String TYPE_CHEESE = "Cheese";
	private static String TYPE_VEGGIE = "Veggie";
	
	@Test
	void test() {
		PizzaStore store = new NyPizzaStore();
		store.orderPizza(TYPE_CHEESE);
		
		store = new CaliforniaPizzaStore();
		store.orderPizza(TYPE_VEGGIE);
	}

}
