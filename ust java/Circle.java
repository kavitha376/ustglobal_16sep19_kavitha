class Circle
  {
         public static void main(String[] args)
       {
     
          double r=15;
         double val=area(r);
        System.out.println("area of circle" +val);
        
        boolean res= oddEven(10);
       System.out.println("the value is" +res);
        int factorial = fact(5);
       System.out.println("the value" +factorial);

    
   }
  static double area(double r)
    {
      double z=3.142*2*r;
       return z;8
    }
  static boolean oddEven(int number)
  {
     if(number%2 ==  0)
       {
          return true;
        }
       else
        {
        return false;
         }
    }

  static int fact(int num)
  {
    int fact=1;
    while(num>0)
    {
       fact= fact*num;
       num--;
    }
   return fact;
  }
  
 

}