import java.io.*;
class Emp
{
	int empid;
	String ename;
	double sal;
	BufferedReader ad=new BufferedReader(
	new InputStreamReader(System.in));
	public void getdata()
	{
		try
		{
			System.out.print("enter empid");
			empid=Integer.parseInt(ad.readLine());
			System.out.print("enter ename");
			ename=ad.readLine();
			System.out.print("enter salary");
			sal=Double.valueOf(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	public void showdata()
	{
		System.out.println(empid+" "+ename+" "+sal);
	}
}
	class demo20
	{
		public static void main(String[] args)
		{
			int ne=0;
			try
			{ 
			  System.out.print("enter no of emp:");
			  ne=Integer.parseInt(new Emp().ad.readLine());
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
          if(ne>0)
          {
            Emp ob[]=new Emp[ne];
            for(int i=0; i<ob.length; i++)
			{
               ob[i]=new Emp();
               ob[i].getdata();
            }
			for(int i=0; i<ob.length; i++)
			{
               	ob[i].showdata();
			}
		  }
		}
	}		
			   
				