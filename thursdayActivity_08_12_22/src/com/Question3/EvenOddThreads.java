package com.Question3;
class EvenThread extends Thread{
	public void run() {
		System.out.println("The even numbers are:");
		for(int i=0;i<=10;i++) {
			if(i%2==0)
			{
				System.out.println(" "+i);
			}
		}
	}
}

class OddThread extends Thread{
	public void run() {
		System.out.println("The odd numbers are:");
		for(int i=0;i<=10;i++) {
			if(i%2!=0)
			{
				System.out.println(" "+i);
			}
		}
	}
}
public class EvenOddThreads {

	public static void main(String[] args) {
	EvenThread e1=new EvenThread();
	OddThread o1=new OddThread();
	e1.start();
	o1.start();

	}

}
