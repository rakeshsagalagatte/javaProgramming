

import Balance.Account;
import java.util.Scanner;

public class AccountDetails{
 
  public static void main(String args[])
  {
    Account A = new Account();
    Scanner S = new Scanner(System.in);
    System.out.println("Enter the Detailes of Account holder .");
    System.out.print("Enter the Account holder name :");
    String name = S.next();
    System.out.print("Enter the Account number :"); 
    String AccountNumber = S.next();
    System.out.print("Enter the balance : ");
    double balance = S.nextDouble();
    System.out.println("Account detailes.");
    System.out.println("Account Holder name  Account number  Balance ");
    A.Display_Balance(name,AccountNumber,balance);
  }
}
