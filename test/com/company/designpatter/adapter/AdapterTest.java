package com.company.designpatter.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.company.designpattern.adapter.Duck;
import com.company.designpattern.adapter.Turkey;
import com.company.designpattern.adapter.TurkeyAdapter;
import com.company.designpattern.adapter.WildTurkey;


class AdapterTest {
	Turkey turkey = new WildTurkey();
	

	
	@Test
	void test() {
		Duck duck = new TurkeyAdapter(turkey);
		duck.quack();
		duck.fly();
		
	}

}
