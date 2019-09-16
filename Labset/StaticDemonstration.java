import java.util.Scanner;

class Outer{

  static int a;
          int c=34;
  static class Inner_Static{
          int b=63;
          void Display()
          { 
            a=10;
           System.out.println("You are in static class and non-static method. static a = "+ a + "  and static class non static data member non b = " + b);
          }
   }
  
          class Inner_NonStatic{
    
             void DisplayMethod()
             {
                 System.out.println("You are in non-static Inner class  ");
                 System.out.println("non static outer class member c = " + c);
             }
           }
            static void static_Method()
           {
             System.out.println("You are in static class and a = " + a );
             
           }
}

public class StaticDemonstration{
 
  
 public static void main(String args[])
 {  
   Outer.Inner_Static J  = new Outer.Inner_Static();   //Declarartion of static class object;
   J.Display();
   Outer O = new Outer();                              //Declarartion of outer class object;
     
   O.static_Method();  
   Outer.Inner_NonStatic Inn = new Inner_NonStatic.new Outer();  //Declarartion of non-static inner class object;
   Inn.DisplayMethod(); 
 }
}


