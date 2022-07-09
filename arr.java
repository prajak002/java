import java.io.*;
class myarr
{
int a[];
int n;
BufferedReader ad=new BufferedReader(new InputStreamReader(System.in));
public void getsize(){
	try
	{
		System.out.print("enter the size");
		n=Integer.parseInt(ad.readLine());
		
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
	if(n>0)
		a=new int[n];
}public void getdata()
{
	for (int i=0; i<a.length; i++)
	{
		System.out.print("enter the data");
		try{
			a[i]=Integer.parseInt(ad.readLine());
		}
		catch (Exception e)
		{
			System.err.println(e);
			i--;
		}
	}
}
public void showdata()
{
	for (int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
class arrdemo
{
	public static void main(String[] args)
	{
		myarr ob =new myarr();
		ob.getsize();
		ob.getdata();
		ob.showdata();
	}
}