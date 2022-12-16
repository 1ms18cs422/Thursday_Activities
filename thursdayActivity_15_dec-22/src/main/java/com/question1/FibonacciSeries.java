package com.question1;

public class FibonacciSeries {
	int fibonacciSeries(int number) {
		int num1=0;
		int num2=1;
                Int result=0;
		
		for(int i=2;i<=number;i++) {
			num1=num2;
			num2=result;
			result=num1+num2;
		}
			
		return result;
	}

}
