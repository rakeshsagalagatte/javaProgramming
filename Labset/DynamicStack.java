import java.util.Scanner;


interface Stack{
  abstract  void push(int a);
  abstract  void pop();
 
}

class Implementation implements Stack{
  int top,size;
  Implementation()
  {
    top = -1;
  }
  int[] array = new int[1000];
 public void push(int a)
  {
    top = top+1;
   
    array[top] = a;
  }
  
  public void pop()
  { 
    if(top==-1)
      System.out.println("Stack is empty!!!!!!");
    else  
      System.out.println("Poped element from the stack : " + array[top--]);
  }  
  
void display()
{
     if(top==-1){
       System.out.println("Stack is empty!!!!!!");
      }else{
          System.out.print("Stack elements are : ");
          for(int i=0;i<=top;i++)
            System.out.print( array[i] + "  ");
          System.out.println(" ");  
     }   
  }
}
public class DynamicStack {
   public static void main(String args[])
   {
     Scanner S = new Scanner(System.in);
     Implementation I = new Implementation();
     String c;
     do {
           System.out.println("1.To push the element into stack " );
           System.out.println("2.To pop a element from the stack ");
           System.out.println("3.To display the content of stack ");
           System.out.println("4.To exit from the program . "); 
           System.out.print("Enter your choice : ");
          int a = S.nextInt();
     switch(a){
                case 1 : System.out.print("Enter the number to push into the stack : ");
                         int n = S.nextInt();
                         I.push(n);
                         break;
                case 2 : I.pop();
                         break;
                case 3 : I.display();
                         break;
                case 4 : return;         
               default : System.out.println("Choose the right option ! " );
                         break;                            
     }
     System.out.print("Do you want to continue ? if so , press yes : " );
     c = S.next();
   }while(c.equalsIgnoreCase("yes")||c.equalsIgnoreCase("y"));
   
   }
}
