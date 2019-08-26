class d2ndlargest{
  public static void main(String args[])
  {
    int a=199,b=11,c=23;
    if(a>b&&a>c)
    {
      if(b>c)
      {
        System.out.println("B is the 2nd greatest element b= " + b);
      }else{
        System.out.println("C is the 2nd greatest element c= " + c);
      }
    }else if(b>c&&b>a)
    {
      if(a>c)
      {
        System.out.println("A is the 2nd greatest element a= " + a);
      }else{
        System.out.println("C is the 2nd greatest element c= " + c);
      }
    }else if(b<c&&c>a)
    {
      if(b>a)
      {
        System.out.println("A is the 2nd greatest element a= " + a);
      }else{
         System.out.println("A is the 2nd greatest element a= " + a);
      }
     } 
  }
}
