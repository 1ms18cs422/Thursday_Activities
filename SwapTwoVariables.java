package com.ThursdatActivity_27_10_22;

import java.util.Scanner;

class swap{
	int a,b;
	void swapMethod(swap obj) {
		int temp=obj.a;
		obj.a=obj.b;
		obj.b=temp;
	}
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		}
}

public class SwapTwoVariables {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      swap ob=new swap();
      ob.get();
      ob.swapMethod(ob);
      System.out.println(ob.a+" "+ob.b);
	}

}
