import java.util.Scanner;

class EmployeeDetails{

   String emp_Name,designation;
   int emp_ID,age;
   double salary;
   Scanner Su = new Scanner(System.in);
   static class EmployeeSalary{
     double basic_sal,da,hra;
     Scanner S = new Scanner(System.in);
     EmployeeDetails E = new EmployeeDetails();
     void readDetailsAndSalary()
     {
       System.out.print("Enter the Employee name :");
       E.emp_Name = S.next();
       System.out.print("Enter the Employee ID : ");
       E.emp_ID = S.nextInt();
       System.out.print("Enter the Employee age :");
       E.age = S.nextInt();
       System.out.print("Enter the Employee Designation :");
       E.designation = S.next(); //POST of an employee
       System.out.print("Enter the Employee basic salary :");
       basic_sal = S.nextDouble();
       System.out.print("Enter the Employee da :");  
       da = S.nextDouble();
       System.out.print("Enter the Employee hra :");
       hra = S.nextDouble();
       E.salary = hra + basic_sal + da ;
       
     }
     
     void display()
     {
       System.out.println(E.emp_Name + "       " + E.emp_ID + "        " + E.age + "           "+ E.designation + "             " + E.salary );
     }
   }
   
   void read()
   {
     System.out.println("Enter the number of employee : ");
     int n = Su.nextInt();
     EmployeeSalary[] e = new EmployeeSalary[100];
     for(int i=0;i<n;i++)
     {
        System.out.println("Enter the employee number " + (i+1) +"detailes. ");
        e[i] = new EmployeeSalary();
        e[i].readDetailsAndSalary();
     }
     System.out.println("emp_Name          emp_ID      age        designation       salary ");
     for(int i=0;i<n;i++)
     {
       e[i].display();
     }
     
   }
   
  
}

public class EmployeeStatic{
   public static void main(String args[])
   {
      System.out.println("Enter the Details of the employees.");
      EmployeeDetails outer =  new EmployeeDetails();
      outer.read();
     
   }
}
