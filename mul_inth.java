import java.io.*;
class  base
	{
	   double a;
	   BufferedReader ad= new BufferedReader(new InputStreamReader(System.in));
	   public void geta()
	   {
	    try
		{		
		System.out.print("Enter principle:");
		a=Double.valueOf(ad.readLine());
		
		 }
		 catch(Exception e)
		 {
			 System.err.println(e);
		 }
     }
	}
class intr extends base{
	double b;
   public void calb()
{
        b=10%a;
}
}

class derive extends intr
	{
	   double c;
	   public void  add()
	   {
	     c=a+b;
		 System.out.print(c);
		}
	}
class demo5991
{
 public static void main(String [] args)
{
  derive ob= new derive();




ob.geta();
ob.calb();
ob.add();
}
} 		