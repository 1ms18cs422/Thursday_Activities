package com.ActivityQuestion1;
public class DivideException {
	static int divide(int x,int y) {
		int z=0;
		try {
			z=x/y;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		return z;
	
}



	public static void main(String[] args) {
		
		try{
			int a=Integer.parseInt(args[1]);
			int b=Integer.parseInt(args[2]);
			int c = divide(a,b);
			
			System.out.println("Result is :"+c);
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
