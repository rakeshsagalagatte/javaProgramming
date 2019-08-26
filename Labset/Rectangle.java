import java.util.Scanner;


class Rectangle{
 
 double length,area,width;
 String color;
 Scanner S = new Scanner(System.in);
 void set_length()
 {
    System.out.print("Enter the length of Rectangle : ");
    length = S.nextDouble(); 
 }

 void set_width()
 {
    System.out.print("Enter the width of Rectangle : ");
    width = S.nextDouble(); 
 }
 
  void set_color()
 {
   // color = new char[100];
    System.out.print("Enter the color of Rectangle : ");
    color = S.next(); 
    //System.out.println(color[0]);
   
 }
 
 
 void findArea()
 {
    set_length();
    set_width();
    set_color();
    area = length * width;
 }
 
 void toCheck(Rectangle r)
 {
  if(area==r.area&&color.equalsIgnoreCase(r.color))
  {
    System.out.println("Matching Rectangles");
     System.out.println("Area1 = " + area + " Area2 = " + r.area + " color1 = " + color + " color2 = " + r.color );
  }else if(area!=r.area&&color.equalsIgnoreCase(r.color)==true){
    System.out.println("Non matching Area");
     System.out.println("Area1 = " + area + " Area2 = " + r.area + " color1 = " + color + " color2 = " + r.color );
  }else if(color.equalsIgnoreCase(r.color)!=true&&area==r.area){
    System.out.println("Non matching color");
     System.out.println("Area1 = " + area + " Area2 = " + r.area + " color1 = " + color + " color2 = " + r.color );
  }else{
     System.out.println("Non Matching Rectangles");
     System.out.println("Area1 = " + area + " Area2 = " + r.area + " color1 = " + color + " color2 = " + r.color );
  }
    
}

}




class Mainclass{
  public static void main(String args[])
  {
   Rectangle Rt = new Rectangle();
   System.out.println("Enter the data for 1st Object .");
     Rt.findArea();
     Rectangle Rect = new Rectangle();
   System.out.println("Enter the data for 1st Object .");
     Rect.findArea();
     Rt.toCheck(Rect);
  }
}
