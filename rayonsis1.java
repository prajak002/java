import java.io.*;
class read{
int a;
 int b;
DataInputStream ad=new DataInputStream(System.in);
public void getData()
{
 try
 {
 System.out.print("enter the number:");
 a=Integer.parseInt(ad.readLine());
 System.out.print("enter the number:");
 b=Integer.parseInt(ad.readLine());
 }
 catch(Exception e)
 {
	 System.err.println(e);
 }
}
public void showData()
{
	System.out.print("the sum is:");
	System.out.print(a+b);
	System.out.print("the product is:");
	System.out.print(a*b);
}
}
class sumprod{
	public static void main(String[] args)
	{
		read ob= new read();
		ob.getData();
		ob.showData();
	}
}
	