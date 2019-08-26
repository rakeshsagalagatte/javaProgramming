import java.util.Scanner;

class Student{
  String branch,USN,name;
  int age,sem,m1,m2,m3;
  double average;
  Scanner S = new Scanner(System.in);
  Student()
  {
    name = "Rakesh";
    USN = "1SI17IS031";
    sem = 5;
    age = 19;
    branch = "ISE";
    m1 = 23;
    m2 = 45;
    m3 = 50;
    average = (m1+m2+m3)/3;
  }
  
  Student(String name,String USN,int age,int sem,String branch,int m1,int m2,int m3)
  {
   this.name = name;
   this.age = age;
   this.sem = sem;
   this.USN = USN;
   this.branch = branch;
   this.m1 = m1;
   this.m2 = m2;
   this.m3 = m3;
   this.average = (m1+m2+m3)/3;
  }
  
  Student(Student st)
  {
   this.name = st.name;
   this.age = st.age;
   this.sem = st.sem;
   this.USN = st.USN;
   this.branch = st.branch;
   this.m1 = m1;
   this.m2 = m2;
   this.m3 = m3;
   this.average = average;
  }
  
  void readData()
  {
     System.out.print("Enter the name of the student : ");
    name = S.next();
    System.out.print("Enter the USN of the student : ");
    USN = S.next();
    System.out.print("Enter the semister of the student : ");
    sem =S.nextInt();
    System.out.print("Enter the age of the student : ");
    age = S.nextInt();
    System.out.print("Enter the branch of the student : ");
    branch = S.next();
    System.out.print("Enter the m1 marks of the student : ");
    m1 = S.nextInt();
    System.out.print("Enter the m2 marks of the student : ");
    m2 = S.nextInt();
    System.out.print("Enter the m3 marks of the student : ");
    m3 = S.nextInt();
    average = (m1+m2+m3)/3;
  }
  
  void Display()
  {
    System.out.println(name + "         "+  USN + "       " + age+ "                " + sem + "         "+ branch+ "             " + m1+ "                " + m2 + "            "+ m3 + "           " + average );
  }
}

class ConstructerDemo{
  public static void main(String args[]){
    
    Student[] S1 = new Student[100];
    System.out.println("Enter the number of students : ");
    Scanner S = new Scanner(System.in);
    int n,a;
    String ch,v;
    
    do{
            System.out.println("1.To demonstrate defined constructer .");
            System.out.println("2.To demonstrate parameterized constructer .");
            System.out.println("3.To demonstrate copy constructer .");
            System.out.print("Enter the choice : ");
            a = S.nextInt();
       switch (a){
          
             case 1 :  S1[0] = new Student(); 
                       System.out.println("Since it is a defined constructer all the students data is same. So that I'm Printing only one student data . If you want to see all stsudents data enter yes : ");
                        v = S.next();
                        System.out.println("Name           USN               Age                 Sem          Branch      M1          M2       M3        Average     ");  
                        if(v=="yes")
                        {   System.out.print("Enter the number of students : ");
                             n = S.nextInt();
                          for(int i=0;i<n;i++)
                          {
                           S1[i] = new Student(); 
                           S1[i].Display();
                          }
                        }else
                           S1[0].Display();
                           break;
             case 2 :  System.out.print("Enter the number of students : ");
                        n = S.nextInt();
                        for(int i =0; i<n;i++)
                        {
                          System.out.print("Enter the name of the student : ");
                          String name = S.next();
                          System.out.print("Enter the USN of the student : ");
                          String USN = S.next();
                          System.out.print("Enter the semister of the student : ");
                          int sem =S.nextInt();
                          System.out.print("Enter the age of the student : ");
                          int age = S.nextInt();
                          System.out.print("Enter the branch of the student : ");
                          String branch = S.next();
                          System.out.print("Enter the m1 marks of the student : ");
                          int m1 = S.nextInt();
                          System.out.print("Enter the m2 marks of the student : ");
                          int m2 = S.nextInt();
                          System.out.print("Enter the m3 marks of the student : ");
                          int m3 = S.nextInt();
                          S1[i] = new Student(name,USN,age,sem,branch,m1,m2,m3);
                        }
                         System.out.println("Name           USN               Age                 Sem          Branch      M1          M2       M3        Average     ");  
                        for(int i=0;i<n;i++)
                        {
                          S1[i].Display();
                        }
                        break; 
           case 3    :  System.out.print("Enter the number of Students : ");  
                         n = S.nextInt();
                          Student Stu = new Student();
                         for(int i =0;i<n;i++)
                          { 
                            System.out.println("Enter the " + (i+1) + " student information ."); 
                            Stu.readData();
                            S1[i] = new Student(Stu);
                          } 
                          System.out.println("Name           USN               Age                 Sem          Branch      M1          M2       M3        Average     ");  
                          for(int i=0;i<n;i++)
                          {
                             S1[i].Display();
                          }   
                          
                          break;
          case 4 :       return;
          default :       System.out.println("Enter the correct choice;");  
                           break;                     
                 }
            System.out.print("Do you want to continue Yes or no : ");
           
            ch = S.next();
      }while(ch.equalsIgnoreCase("yes"));
  }
}
