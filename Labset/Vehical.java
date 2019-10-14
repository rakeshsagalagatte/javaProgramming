import java.util.Scanner;
class CollisionOccursException extends Exception {
    
   CollisionOccursException ()
    {
        System.out.print("Collision occurs :  ")  ;
     } 
}

public class Vehical {
      static void check(String direction1,String direction2)
     { 
        try{
                if(! direction1.equalsIgnoreCase(direction2)) 
                    throw new   CollisionOccursException();
                else 
                     System.out.println(" No collision occur :)")  ;
        }
        catch ( CollisionOccursException T)
        {
            System.out.println(T );
        }
     }
     
     public static void main(String args[])
     {
     
        Scanner S =new Scanner(System.in);
        String direction1,direction2;
        System.out.print("Enter the vehical 1 direction : ");
        direction1 = S.next();
        System.out.print("Enter the vehical 2 direction : ");
        direction2 = S.next();
        check(direction1,direction2);
     }
}
