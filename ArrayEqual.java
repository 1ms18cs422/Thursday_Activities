package firstProject;
import java.util.*;
public class ArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter no of elements in an array");
		int n=sc.nextInt();
		
		int a1[]=new int[n];
		System.out.println("enter first array");
		for(int i=0;i<n;i++)
		a1[i]=sc.nextInt(); 
		
		int a2[]=new int[n];
		System.out.println("enter Second array");
		for(int i=0;i<n;i++)
		a2[i]=sc.nextInt();
		
		
		
		
		System.out.println(Arrays.equals(a1,a2));
	}

}
