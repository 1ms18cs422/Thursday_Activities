class Rectangle {
double length;
double breadth;
Rectangle (double l,double b)
{
length=l;
breadth=b;
}
void Area(){
double area=length*breadth;
system.out.println("Area of Rectangle is:"+area);
}
void Perimiter(){
double peri=2*(length+breadth);
System.out.println("Perimiter of Rectangle is:"+peri);
}
}
class Square extends Rectangle {
double side;
Square(double s){
side=s;
}
void Area()
{
square_area=side*side;
System.out.println("Area of Square is:"+square_area);
}
void Perimiter()
{
square_peri=4*side;
System.out.println("Perimiter of Square is:"+square_peri);
}
}
class Main{
public static void main (String args[]){
Rectangle r=new Ractangle(10,20);
r.Area();
r.Peritmiter();
Square s1=new Square(30);
s1.Square_Area();
S1.Square_Perimiter();
}
}




