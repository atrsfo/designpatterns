package com.company.designpattern.factory.abstrct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

	@Test
	void test() {
		PizzaStore pizzaStore = new NyPizzaStore();
		pizzaStore.orderPizza("Cheese");
		System.out.println();
	    pizzaStore = new CaliforniaPizzaStore();
		pizzaStore.orderPizza("Cheese");
	}

}
