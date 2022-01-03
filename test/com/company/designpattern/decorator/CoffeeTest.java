package com.company.designpattern.decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTest {

	@Test
	void test() {
		Beverage coffee  = new Capuccino();
				 coffee = new Soy(coffee);
				 coffee = new Whip(coffee);
				 
	   System.out.println("Cost of Soy Whipped Capuccino is "+coffee.getCost());			 
	}

}
