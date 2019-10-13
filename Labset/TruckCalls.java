import java.util.Scanner;

abstract class Truck{
  int sec,min,hr;
  double charge;
  abstract void call(int s);

}

class Oridinary extends Truck
{
   void call(int s)
   {
     
     sec = s;
     if(sec > 59)
     {
       min = sec/60;
       sec = sec%60;
     }
     charge = min * 2;
     if(min > 59)
     {
       hr = min/60;
       min = min %60; 
     }
     
     System.out.println("You are using Ordinary call service and call charges 2 rupees per minute .");
     System.out.println("Your call duration is " + hr + ":" + min + ":" + sec );
     System.out.println("Call charges is " + charge + "/- INR.");
   }
}

class Urgent extends Truck
{
   void call(int s)
   {
     sec = s;
     if(sec > 59)
     {
       min = sec/60;
       sec = sec%60;
     }
     charge = min * 4;
     if(min > 59)
     {
       hr = min/60;
       min = min %60; 
     }
     
     System.out.println("You are using Urgent call service and call charges 4 rupees per minute .");
     System.out.println("Your call duration is " + hr + ":" + min + ":" + sec );
     System.out.println("Call charges is " + charge + "/- INR.");
   }
}

class Lightning extends Truck
{
   void call(int s)
   {
     
     sec = s;
     if(sec > 59)
     {
       min = sec/60;
       sec = sec%60;
     }
     charge = min * 6;
     if(min > 59)
     {
       hr = min/60;
       min = min %60; 
     }
     
     System.out.println("You are using Lightning call service and call charges 6 rupees per minute .");
     System.out.println("Your call duration is " + hr + ":" + min + ":" + sec );
     System.out.println("Call charges is " + charge + "/- INR.");
   }
}



public class TruckCalls{

  public static void main(String args[])
  {
     Oridinary O = new Oridinary();
     Urgent U = new Urgent();
     Lightning L = new Lightning();
     Scanner Se = new Scanner(System.in);
    
    String ch;
    int c;
    do{
           System.out.println("1. To make Oridinary call , And this call may charge is 2.00 rupees / min");
           System.out.println("2. To make Urgent call , And this call may charge is 4.00 rupees / min");
           System.out.println("3. To make Lightning call, And this call may charge is 6.00 rupees / min");
           System.out.print("Choose the mode of call ");
           int a = Se.nextInt();
     
    switch (a)
    {
           case 1 : System.out.print("How much time you will talk seconds : ");
                      c = Se.nextInt();
                     O.call(c);
                     break;
           case 2 :  System.out.print("How much time you will talk in seconds : ");        
                     c = Se.nextInt(); 
                     U.call(c); 
                     break; 
           case 3 :  System.out.print("How much time you will talk seconds : ");        
                     c = Se.nextInt();
                     L.call(c);
                     break;
         default  :   System.out.println("Enter the correct choice ");
                     break;                        
    }
    
    System.out.print("Do you want to make another call ? then press yes : ");
    ch = Se.next();
  }while(ch.equalsIgnoreCase("yes"));
 }
}
