package ustglobal;

public class Recursion {
	public static  int Rec(int num)
	{
		if(num==0)
			{
			return 1;
			
			}
		else
			{
				return(num*Rec(num-1));
			}
	}
	
public static void main(String[] args) {
    int fact=1;
    int num=4;

	int res = Rec(num);
	System.out.println("factorial of "+num+"is:"+res);
		
		
	}
}
