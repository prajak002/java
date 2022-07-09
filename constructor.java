class Test
{
	private int a,b;
	
	public _test (int x, int y){
		a=x;
		b=y;
	}
	public  void showdata(){
		System.out.println(a+"\t"+b);
	}
}	
class demo5
{
	public static void main(String[] args){
	
	Test obj=new Test(670,700);
	obj.showdata();
	}
	
}	
	
	