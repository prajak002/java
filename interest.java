
import java.io.*;
class amount{
	  protected double p,t;
      BufferedReader ad= new BufferedReader(new InputStreamReader(System.in));
	public void getpt()
	{
	
	
			System.out.print("Enter principle:");
		p=Double.valueOf(ad.readLine());
		System.out.print("Enter time:");
		t=Double.valueOf(ad.readLine());
		
	}
	
	
}
class simple extends amount
{
	int c ;
	int r;
  public void si()
  {
	 r=Integer.parseInt(ad.readLine());
	 c=p*r*t/100;
	  System.out.print("simple interest value="+c);
	 
	 
  }
 }
  class compound extends amount
  {	
      int u, rr;
	  public void com()
  {
	 rr=Integer.parseInt(ad.readLine());
	 u=(p*math.pow((1+rr/100),t))-p;
	  System.out.print("compound interest value="+u);
	 
	 
  }
  
 }
 class demo599
{
 public static void main(String [] args)
{
  
 
simple ob= new simple();
ob.getpt();
ob.si();
ob.getpt();
ob.com();
}
} 