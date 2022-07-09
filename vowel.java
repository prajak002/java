import java.io.*;
class demo99{
   public static void main(String args[]){
      int count = 0;
	  String sentence="";
;
      System.out.println("Enter a sentence :");
  BufferedReader ad=new BufferedReader(new InputStreamReader(System.in));
  try{
	  String sentence=ad.readLine();
  }
  catch(Exception e){
	  System.err.println(e);
  }
  
      for (int i=0 ; i<sentence.length(); i++){
        
		
			char ch = sentence.charAt(i);
		
		
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}