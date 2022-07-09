class Test
{
	private int a,b;
	
	public Test (int a, int b){
		a=a;
		b=b;
	}
	public  void showdata(){
		System.out.println(a+"\t"+b);
	}
}	
class demo5
{
	public static void main(String[] args){
	
	Test obj=new Test(70,700);
	obj.showdata();
	}
	
}	
	
	