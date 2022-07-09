class Test
{
	private int a,b;
	
	public Test (int a, int b){
	this.a=a;
	this.b=b;
	}
	public  void showdata(){
		System.out.println(a+"\t"+b);
	}
}	
class demo6
{
	public static void main(String[] args){
	
	Test obj=new Test(70,700);
	obj.showdata();
	}
	
}	
	
	