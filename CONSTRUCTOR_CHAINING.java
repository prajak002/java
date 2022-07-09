class  Base
{
    protected int a;
	protected double b;
	public Base( int x, double y)
	{
	   a=x;
	   b=y;
	   }
}
class intr extends Base{
	double b;
   public intr(int m ,n)
{
        super(m,n);
		b=100%(x+y);
		
}
}

class Derive extends intr
{
 private int c;
 public  Derive(int b, int r)
 {
      super(,q);
	  c=r;
	 }
 public  void showData()
 {
    System.out.println(a+ " " +b+" " +c);
}
}
 class Demo
{
   public static void main(String[] args)
  {
     Derive ob =new  Derive(10,7.66,30);
     ob.showData();
}
}	 
	   
	   