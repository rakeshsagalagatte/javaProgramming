import java.util.Scanner;

class Outer{

  static int a;
   int c=34;
static class Inner_Static{
   int b=63;
    void DisplayMethod()
   {  a=10;
     System.out.println("You are in static class and non-static method."+ a);
   }
  }
  
  class Inner_NonStatic{
    
   void DisplayMethod()
   {
      System.out.println("You are in non-static Inner class  ");
   }
  }
  static void Static_Method()
  {
  System.out.println("You are in static class and a = ." + a );
  }
}

class MainClass{
 
  
 public static void main(String args[])
 {    
   Outer.Inner_Static J  = new Outer.Inner_Static();   //Declarartion of static class object;
   J.DisplayMethod();
   Outer O = new Outer();                              //Declarartion of outer class object;
   System.out.println("Static variable : " + O.a);    
   O.Static_Method();
  Outer.Inner_NonStatic Inn = new O.Inner_NonStatic();  //Declarartion of non-static inner class object;
   
 }
}


