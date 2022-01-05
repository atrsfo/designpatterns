package com.company.designpattern.factory.simple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleFactoryPizzaTest {

	@Test
	void test() {
				
		Pizza pizza1 = SimplePizzaFactory.createPizza(SimplePizzaFactory.pizzaType.CHEESE);
		Pizza pizza2 = SimplePizzaFactory.createPizza(SimplePizzaFactory.pizzaType.CORN);
	}

}
