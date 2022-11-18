package com.ThursdatActivity_27_10_22;

public class Circle{
	
	private float center;
	private float radius;
	private static int count=0;
	

	
	
		Circle()
		{
			System.out.println("Default Constructor");
		}
		Circle(float center,float radius)
		{
			this.center=center;
			this.radius=radius;
			
			count++;
		}
		
		public static void main(String[] args) {
			Circle c1=new Circle(12.1f,28.6f);
			Circle c2=new Circle(17.2f,18.5f);
			System.out.println("Circle Center-1:"+c1.center+"Radius:"+c1.radius);

			System.out.println("Circle Center-2:"+c2.center+"Radius:"+c2.radius);

			System.out.println("No of instances of a class:"+Circle.count);
			
			
		}
			
