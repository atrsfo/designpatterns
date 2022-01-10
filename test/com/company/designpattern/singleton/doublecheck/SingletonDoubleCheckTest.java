package com.company.designpattern.singleton.doublecheck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonDoubleCheckTest {

	@Test
	void test() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		assertEquals(instance1,instance2);
	}

}
