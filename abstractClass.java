abstract class base
{
   public void func()
   {
     System.out.println("red");
	 }
}
class Derive extends base
{
   public void func1()
{
  System.out.println("green");
  }
  }
  class demo
  {
   public static void main(String[] args)
   {
    Derive ob =new Derive();
	ob.func();
	ob.func1();
	}
	}
	
  