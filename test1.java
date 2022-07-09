class  test1
{
	public static void show()
	{
		System.out.println("red");
	}
	public void display()
	{
		System.out.println("green");
	}
}

class demo1
{
   public static void main(String[] args)
   {
       test1 obj=null;
       test1 ob= new test1();
       obj.show();
       ob.display();
       ob.show();
       obj.display();
   }
}   