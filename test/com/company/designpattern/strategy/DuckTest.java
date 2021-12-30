package com.company.designpattern.strategy;

import org.junit.jupiter.api.Test;

class DuckTest {

	@Test
	void test() {
		Duck duck = new Duck();
		
		FlyBehavior flyBehavior = new FlyWithWings();
		duck.setFlyBehavior(flyBehavior);
		duck.performFly();
		
		flyBehavior = new FlyRocketPowered();
		duck.setFlyBehavior(flyBehavior);
		duck.performFly();
	}

}
