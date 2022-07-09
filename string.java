import java.io.*;
class mystr{
	String str;
	BufferedReader ad= new BufferedReader( new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
			System.out.print("enter a string:");
			str=ad.readLine();
		}
		catch(Exception e)
		{}
	}
	public void check()
	{
		StringBuffer  sb= new StringBuffer(str);
		sb.reverse();
		String rs= new String(sb);
		 if(str.equals(rs)== true)
			  System.out.print("pallindrome");
		  else
			   System.out.print("not pallindrome");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		mystr ob=new mystr();
		ob.getData();
		ob.check();
	}
}
	
	