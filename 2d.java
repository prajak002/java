
import java.io.*;
class myarr{
int m[][];
int r,c;
ufferedReader ad=new BufferedReader(new InputStreamReader(System.in));
public void getsize()
{
try{
	System.out.print("enter the rows");
		r=Integer.parseInt(ad.readLine());
		System.out.print("enter the columns");
		c=Integer.parseInt(ad.readLine());
}
catch(Exception e){
	System.err.println(e);
}
if(r>0 && c>0)
	m=new int [r][c];
}
public void getdata(){
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			System.out.print("enter data");
			try{
	
		m[i][j]=Integer.parseInt(ad.readLine());
			}
			catch(Exception e){
	System.err.println(e);
	j--;
}
		}
	}
}
public void showdata(){
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			System.out.print(m[i][j] +" ");
		}
		System.out.println()
	}
}
}
			
	
class demo17{
public static void main(String[] args)
{
myarr ob= new myarr();
ob.getsize;
ob.getdata;
ob.showdata();
}
}