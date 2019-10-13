import java.util.Scanner;

class EmployeeDetails{

   String emp_Name,designation;
   int emp_ID,age;
   double salary;
   Scanner Su = new Scanner(System.in);
   class EmployeeSalary{
     double basic_sal,da,hra;
     Scanner S = new Scanner(System.in);
    
     void readDetailsAndSalary()
     {
       System.out.print("Enter the Employee name :");
       emp_Name = S.next();
       System.out.print("Enter the Employee ID : ");
       emp_ID = S.nextInt();
       System.out.print("Enter the Employee age :");
       age = S.nextInt();
       System.out.print("Enter the Employee Designation :");
       designation = S.next(); //POST of an employee
       System.out.print("Enter the Employee basic salary :");
       basic_sal = S.nextDouble();
       System.out.print("Enter the Employee da :");  
       da = S.nextDouble();
       System.out.print("Enter the Employee hra :");
       hra = S.nextDouble();
       salary = basic_sal + da + hra;
       
     }
     
     void display()
     {
       System.out.println(emp_Name + "       " + emp_ID + "        " + age + "           "+ designation + "             " + salary );
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

public class EmployeeNonstatic{
   public static void main(String args[])
   {
      System.out.println("Enter the Details of the employees.");
      EmployeeDetails outer =  new EmployeeDetails();
      outer.read();
     //
     // EmployeeDetails.EmployeeSalary inner = new outer.EmployeeSalary();
     
   }
}
