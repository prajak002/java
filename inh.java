class base
{
   protected  int a,b;
   public void setdata()
   {
     a=13;
	 b=5;
	 }
}
class Derive extends base
{
    private int c;
  public void add()
{
   c=a+b;
   System.out.print("addition="+c);
}
}
class demo5555
{
 public static void main(String [] args)
{
  
 
Derive ob= new Derive();
ob.setdata();
ob.add();
}
} 