class Base
{
	public void showData()
	{
		System.out.println("Red");
		
	}
	
}

class derive extends Base
{
	public void showData()
	{
		super.showData();
		System.out.println("Green");
		
	}
	
}
class Demo
{
	public static void main(String[] args)
	{
		derive ob=new derive();
		ob.showData();
		
	}
	
}	