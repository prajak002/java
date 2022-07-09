class Base
{
	public  void fun()
	{
		System.out.println("Red");
		
	}
	
}

class derive extends Base
{
	public  void fun()
	{
		
		System.out.println("Green");
		
	}
	
}
class Demo
{
	public  void main(String[] args)
	{
		Base ob = new derive();
		ob.fun();
		
	}
	
}	