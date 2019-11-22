class bmi
{

       public static void main(String[] args)
       {
          double w=60;
          double h=5.6;
          double res=w/(h*h);
          double m=res*10;
          System.out.println(m);
              
         if(m > 40)
          {
             System.out.println("out of range");
          }

          else if( m>=30 && m<=39.9)
          {
             System.out.println(" you are in the obse range");
          }
         else if(m>=25 && m<=29.9 )
         {
            System.out.println("you are over weight");
          }
         else if(m >= 18.5&& m<=24.9)
         {
            System.out.println("you are in healthy weight range");
          }
        else 
          {
              System.out.println("you are under weight");
           }
      }
 }