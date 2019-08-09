import java.util.Scanner;
//import java.lang.Math;
class Tofind{

  public static void main(String args[])
  {
    circle c = new circle();
    c.fun();
    rectangle r = new rectangle();
    r.rec();
  }
}

class circle{
  Scanner sy = new Scanner(System.in);
   int radius;
   
   void fun(){
   System.out.print("Read the value of radius : ");
     radius=sy.nextInt();
    System.out.println("The area of the circle : " + (Math.PI * (Math.pow(radius,2))));
   }
   
   
} 

class rectangle{
  Scanner sy = new Scanner(System.in);
  int len,wid;
  void rec(){
   System.out.println("Read length and breadth of a rectangle : ");
   len=sy.nextInt();
   wid=sy.nextInt();
   System.out.println("Area of rectangle = " + (len * wid));
  }
}
