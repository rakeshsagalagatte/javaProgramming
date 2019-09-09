import java.util.Scanner;

abstract class Player{

  String playerName,country;
  int age,matches;
  void read();
  void display(); 
}

class Cricket_Player extends Player{

   Scanner S = new Scanner();
   void read()
   {
       System.out.print("Enter the cricketer name :");
       playerName = S.next();
       System.out.print("Enter the age : ");
       age = S.nextInt();
       System.out.print("Enter the number of matches :");
       matches = S.nextInt();
       System.out.println("Enter the country of a player :");
       country = S.next();
   }
   
}

class Football_Player extends Player{

   Scanner S = new Scanner();
   void read()
   {
       System.out.print("Enter the Footballer name :");
       playerName = S.next();
       System.out.print("Enter the age : ");
       age = S.nextInt();
       System.out.print("Enter the number of matches :");
       matches = S.nextInt();
       System.out.println("Enter the country of a player :");
       country = S.next();
   } 
   
   void display()
   {
   
   } 
}

class Hockey_Player extends Player{

   Scanner S = new Scanner();
   void read()
   {
       System.out.print("Enter the hockey player name :");
       playerName = S.next();
       System.out.print("Enter the age : ");
       age = S.nextInt();
       System.out.print("Enter the number of matches :");
       matches = S.nextInt();
       System.out.println("Enter the country of a player :");
       country = S.next();
   }
  
}

public class PlayerMainClass{

  public static void main(String args[])
  {
    Cricket_Player[] C = new Cricket_Player[100];
    Football_Player[] F = new Football_Player[100];
    Hockey_Player[] H = new Hockey_Player[100];
    Scanner S = new Scanner();
    
    System.out.println("1.To Demonstrate Cricket_Players class.");
    System.out.println("2.To Demonstrate Football_Players class.");
    System.out.println("3.To Demonstrate Hockey_Players class.");
    System.out.println("4.To Exit from program.");
    int a = S.nextInt();
    switch(a){
    
      case 1 :   System.out.println("Enter the number of players");
                 int n = S.nextInt();
                 for(int i=0;i,n;i++)
                 {
                   System.out.println("Enter the player number " + (i+1) +  "  detailes.");
                    C[i] = new Cricket_Player();
                    C[i].read();
                 }
                 for(int i =0;i<n;i++)
                 {
                   C[i].display();
                 }
                
    }
  }
}
