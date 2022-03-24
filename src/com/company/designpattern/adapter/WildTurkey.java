package com.company.designpattern.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Wild Turkey Gobble");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Wild Turkey Flying short Distance");
	}

}
