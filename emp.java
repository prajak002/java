import java.io.*; 
public class emp
{
    public static void main(String args[])
    {
        try 
        {
           
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
            System.out.print("Enter employee name:");
            String name=br.readLine(); 
 
            System.out.println("Enter employee id number:");
            int num=Integer.parseInt(br.readLine()); 
                        
                System.out.println("employee  details are:");
            System.out.println("Student name is:" +name);
            System.out.println("Student number is:" +num);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}