
class Member{
    String name;
    int age;
    long ph_no;
    double salary;
    String address;
    Member(String name,int age,long ph_no,double salary){
        this.name=name;
        this.age=age;
        this.ph_no=ph_no;
        this.salary=salary;
        this.address=address;
        
    }
    
    public void printSalary{
        System.out.println(salary);
    }
    class Employee extends Member{
        String specialization;
        String department;
        Employee(String name,int age,long ph_no,double salary,String address ,String sp,String dept)
        {
            super(name,age,ph_no,salary, address);
            specialization=sp;
            department=dept;
            
        }
        
       public void printDetails{
           System.out.println(name+age+ph_no+salary+address+specialization+department);
       }
    }
            
   class Manager extends Member{
       String specialization;
       String department;
      
       Manager(String name,int age, long ph_no,double salary,String address,String sp, String dept){
           super(name,age,ph_no,salary,address)
           specialization=sp;
           department=dept;
       }
          public void printDetails{
              System.out.println(name+age+ph_no+salary+address+specialization+department);
          }
           
       }
       
     class Main{
         public static void main (String a[])
         {
             Employee e=new Employee("ravi",23,57890087,34000,"Bangalore", "software-developer","IT"
             e.printSalary();
             e printDetails();
             Manager m=new Manager("suma",24,9909544,50000,"pune", "administrator","sales");
             m.printSalary();
             m.printDetails();
         }
     }
