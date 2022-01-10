package com.company.designpattern.singleton.enumm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonEnumTest {

	@Test
	void test() {
		Singleton singleton1 = Singleton.INSTANCE;
		singleton1.foo();
		singleton1.bar();
		System.out.println(singleton1.hashCode());
		Singleton singleton2 = Singleton.INSTANCE;
		singleton2.foo();
		singleton2.bar();
		System.out.println(singleton2.hashCode());
		assertEquals(singleton1,singleton2);
	}

}
