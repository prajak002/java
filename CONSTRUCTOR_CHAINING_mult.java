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
   public intr(int m ,double n,  double q )
{
        super(m,n);
		b=q;
		
}
}

class Derive extends intr
{
 private int c;
 public  Derive(int t, double y,double m,int r)
 {
      super(t,y,m);
	  
	  c=r;
	 }
 public  void showData()
 {
    System.out.println(a+ " " +b+" " +c +" " +b);
}
}
 class Demo
{
   public static void main(String[] args)
  {
     Derive ob =new  Derive(10,7.66,4.88, 8);
     ob.showData();
}
}	 
	   
	   