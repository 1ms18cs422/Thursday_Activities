
class Student{
   private String name;
   protected int I'd;
    double grade;
    int age;
     Student(String name,int id,int age,){
        this.name=name;
        this.id=id;
        this.age=age;
        }
        boolean is_passed(float grade){
             return true;
        };
}

    class Undergrad extends Student{
        Undergrad(String name,int id,int age)
        {
            super(name,id,age,);
         
         }

        boolean is_passed(float grade){
        if(grade>70)
           return super is_passed(grade);
        else
            return false;
        
      
       }
    }
            
   class Grad extends Student{
       
      
       Grad(String name,int id,int age)
           {
           super(name,id, age);
       }
          Boolean is_passed(float grade)
        {
         if(grade>80)
            return super is_passed(grade);
        else
           return false;
           
       }
       
     class Main{
         public static void main (String a[])
         {
             Undergrad ug=new Undergrad("ravi",01,21);
             System.out.println("Undergrad is passed:"+ug.is_passed(78));
             Grad g=new Grade("suma",04,24);
             System.out.println("Grad is passed:"+g.is_passed(89));

           
         }
     }
