public class StudentDetaila {

	public static void main(String[] args) {
		StudentDetaila s1=new StudentDetaila();
		StudentDetaila s2=new StudentDetaila();
		StudentDetaila s3=new StudentDetaila();
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
		s1.Display();
		s2.Display();

		s3.Display();
		System.out.println(s1.getCount());
		
	}
		
		String name;
		int age;
		int weight;
		public static int count=0;
		public StudentDetaila()
		{
		 count++;
		}
		public  void getDetails()
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter name of student");
			name=sc.next();
			
			System.out.println("Enter age of student");
			age=sc.nextInt();
			
			System.out.println("Enter weight of student");
			weight=sc.nextInt();
			
			
		}
		
		public void Display()
		{
			System.out.println(name+age+weight);	
		}
		public static int getCount() {
		return count;
		}
	

}
