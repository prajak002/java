class Employee 
{
    private int id;
	private double sal;
	private String name;
	public void getdata()
	{
		id=2345;
		name="prajak";
		sal=1000;
}
public void showdata()
{
	System.out.print("the id is"+id);
	System.out.print("\n the name is"+name);
	System.out.print("\n the salary is "+sal);
}
}
class demo2
{
	public static void main(String[] args)
	{
		Employee ob=new Employee ();
		ob.getdata();
		ob.showdata();
	}
}	