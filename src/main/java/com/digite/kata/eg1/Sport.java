package com.digite.kata.eg1;

public class Sport implements Mode{

	public String getMode() {
		return "SPORT";
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return 20;
	}
}
