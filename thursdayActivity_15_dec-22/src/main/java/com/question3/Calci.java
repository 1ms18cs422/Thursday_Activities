package com.question3;

public class Calci {
	public int addition(int a,int b) {
		return a+b;
	}
	public int subtraction(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		try {
		if(b==0) 
			throw new IllegalArgumentException("the dinominator should not be zero");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return a/b;
	}
	
	
	

}
