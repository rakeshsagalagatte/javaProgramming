import java.util.Scanner;

class EmployeeDetails{

   String emp_Name,designation;
   int emp_ID,age;
   double salary;
   
   class EmployeeSalary{
     double basic_sal,da,hra;
     Scanner S = new Scanner(System.in);
     EmployeeSalary ReadDetailsAndSalary()
     {
       System.out.print("Enter the Employee name :");
       name = S.next();
       System.out.print("Enter the Employee ID : ");
       emp_ID = S.nextInt();
       System.out.print("Enter the Employee age :");
       age = S.nextInt();
       System.out.print("Enter the Employee Designation :");
       designation = S.next();
       System.out.print("Enter the Employee basic salary :");
       basic_sal = S.nextInt();
       System.out.print("Enter the Employee da :");
       System.out.print("Enter the Employee name :");
       System.out.print("Enter the Employee name :");
     }
   }
}
