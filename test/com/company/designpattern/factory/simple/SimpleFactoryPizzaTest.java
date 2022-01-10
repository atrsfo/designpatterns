package com.company.designpattern.factory.simple;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SimpleFactoryPizzaTest {

	@Test
	void test() {
				
		Pizza pizza1 = SimplePizzaFactory.createPizza(SimplePizzaFactory.pizzaType.CHEESE);
		Pizza pizza2 = SimplePizzaFactory.createPizza(SimplePizzaFactory.pizzaType.CORN);
		
		List<Object> objects = new ArrayList();
		objects.add(pizza1);
	}

}
