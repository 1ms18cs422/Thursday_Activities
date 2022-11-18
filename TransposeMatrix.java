package firstProject;
import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		
		
		System.out.println("Enter no of cols");
		int cols=sc.nextInt();
		
		int arr[][]= new int[rows][cols];		
		System.out.println("Enter elements of matrix");
		for(int i=0;i<rows;i++)
		   for(int j=0;j<cols;j++)
			//int  j;
			 arr[i][j] = sc.nextInt();
		
		
		
		
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				c[i][j]=arr[j][i];
				//System.out.println("Transpose is:");
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
