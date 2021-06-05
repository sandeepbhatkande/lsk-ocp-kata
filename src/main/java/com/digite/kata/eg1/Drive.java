package com.digite.kata.eg1;

public class Drive implements Mode{

	public String getMode() {
		return "Drive";
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return 25;
	}
}
