import java.io.*;
class mystr
{
 String a="prajak";
 String b="sainik";
 public void showdata()
 {
  System.out.println(a);
	System.out.println(b);
  System.out.println(a.toUpperCase());
  System.out.println(a.toLowerCase());
 System.out.println(a.length());
 
 System.out.println(a.charAt(2));
 System.out.println(a.indexOf("n"));
 System.out.println(a.replace("t","p"));
 System.out.println(a.compareTo(b));
 System.out.println(a.lastIndexOf("an"));
 System.out.println(a.substring(5))
 ;
 System.out.println(a.substring(1,5));
 char ar[]=a.toCharArray();
 for(int i=0;i<ar.length; i++)
 {
	 System.out.println(ar[i]+" ");
	 
 }
 }
}
class Demo30
{
	public static void main(String[] args)
	{
		mystr cb=new mystr();
		cb.showdata();
	}
}