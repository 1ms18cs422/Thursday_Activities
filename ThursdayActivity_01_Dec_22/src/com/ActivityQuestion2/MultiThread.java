package com.ActivityQuestion2;

public class MultiThread extends Thread {
	static String msg[]= {"java","is","hot","aromatic","and","invigorating"};
	public void run() {
		String name=getName();
		for(int i=0;i<msg.length;i++) {
		
		try {
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(name+msg[i]);
		}
		
	}

	public static void main(String[] args) {
		MultiThread m1=new MultiThread();
		MultiThread m2=new MultiThread();
		m1.start();
		//for continous printing of first thread
		/*try {
			System.out.println("current thread name is:"+m1.getName());
			m1.join();
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}*/
		m2.start();
		
	}
		
		
	

}
