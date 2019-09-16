import java.util.Scanner;

abstract class Player{

  String playerName,country;
  int age,matches;
 abstract void read();
  abstract void display(); 
}

class Cricket_Player extends Player{

   Scanner S = new Scanner(System.in);
   void read()
   {
       System.out.print("Enter the cricketer name :");
       playerName = S.next();
       System.out.print("Enter the age : ");
       age = S.nextInt();
       System.out.print("Enter the number of matches :");
       matches = S.nextInt();
       System.out.print("Enter the country of a player :");
       country = S.next();
   }
   
   void display()
   {
     System.out.println(playerName + "          " + age + "       " + matches + "       " + country);
   } 
   
}

class Football_Player extends Player{

   Scanner S = new Scanner(System.in);
   void read()
   {
       System.out.print("Enter the Footballer name :");
       playerName = S.next();
       System.out.print("Enter the age : ");
       age = S.nextInt();
       System.out.print("Enter the number of matches :");
       matches = S.nextInt();
       System.out.print("Enter the country of a player :");
       country = S.next();
   } 
   
   void display()
   { 
    System.out.println(playerName + "          " + age + "       " + matches + "       " + country);
   } 
}

class Hockey_Player extends Player{

   Scanner S = new Scanner(System.in);
   void read()
   {
       System.out.print("Enter the hockey player name :");
       playerName = S.next();
       System.out.print("Enter the age : ");
       age = S.nextInt();
       System.out.print("Enter the number of matches :");
       matches = S.nextInt();
       System.out.print("Enter the country of a player :");
       country = S.next();
   }
   
   void display()
   {
     System.out.println(playerName + "          " + age + "       " + matches + "       " + country);
   } 
  
}

public class PlayerMainClass{

  public static void main(String args[])
  {
    Cricket_Player[] C = new Cricket_Player[100];
    Football_Player[] F = new Football_Player[100];
    Hockey_Player[] H = new Hockey_Player[100];
    Scanner S = new Scanner(System.in);
     String ch;
   
   do { 
    System.out.println("1.To Demonstrate Cricket_Players class.");
    System.out.println("2.To Demonstrate Football_Players class.");
    System.out.println("3.To Demonstrate Hockey_Players class.");
    System.out.println("4.To Exit from program.");
    System.out.print("Enter your choice : ");
    int a = S.nextInt();
    int n;
    switch(a){
    
      case 1 :   System.out.print("Enter the number of players");
                 n = S.nextInt();
                 for(int i=0;i<n;i++)
                 {
                   System.out.println("Enter the player number " + (i+1) +  "  detailes.");
                    C[i] = new Cricket_Player();
                    C[i].read();
                 }
                 System.out.println();
                 System.out.println("playerName        age      matches        country");
                 for(int i =0;i<n;i++)
                 {
                   C[i].display();
                 }
                 break ;
      case 2 :   System.out.println("Enter the number of players");
                  n = S.nextInt();
                 for(int i=0;i<n;i++)
                 {
                   System.out.println("Enter the player number " + (i+1) +  "  detailes.");
                    F[i] = new Football_Player();
                     F[i].read();
                 }
                 System.out.println();
                 System.out.println("playerName           age        matches          country");
                 for(int i =0;i<n;i++)
                 {
                   F[i].display();
                 }
                 break ;
      case 3 :   System.out.println("Enter the number of players");
                  n = S.nextInt();
                 for(int i=0;i<n;i++)
                 {
                   System.out.println("Enter the player number " + (i+1) +  "  detailes.");
                    H[i] = new Hockey_Player();
                    H[i].read();
                 }
                 System.out.println();
                 System.out.println("playerName           age        matches          country");
                 for(int i =0;i<n;i++)
                 {
                   H[i].display();
                 }
                 break ;  
       case 4 : System.out.println("Exit From the program .");                            
                 return ;
                 
     }
     System.out.print("Do you want to continue : ");
     ch = S.next();
   }while(ch.equalsIgnoreCase("Yes"));
  
  }
}
