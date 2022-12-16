package com.question1;

public class FibonacciSeries {
	int fibonacciSeries(int number) {
		if(number<=0) {
			return 0;
		}
		else if(number==1)
		{
			return 1;
		}
		else
		{
			return fibonacciSeries(number-1)+fibonacciSeries(number-2);
		}
	}

}
