import java.util.*;
class strtok
{   int freq=0;
   String st="hello from java see java learn java ";
   public void showdata()
   {
     StringTokenizer str= new StringTokenizer(st);
	 while(str.hasMoreTokens()==true)
	 {
	   String ts= str.nextToken();
	   
	   if(ts.equals("java"))
	   {
		   freq=freq+1;
	   }
	  }
	  System.out.println(freq);
	  }
	  
 }
	  class Demo44
	  {
	  public static void main(String[] args)
	  {
	   strtok ob = new strtok();
	   ob.showdata();
	   }
	   }