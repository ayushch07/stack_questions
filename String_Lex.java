package Stack_Questions;
import java.util.*;

public class String_Lex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			String str=sc.next();
			String str2=" ";
			String st=str;
		
      for(int i=str.length()-1;i>=0;i--)
      {
    	if(i==str.length()-1)
    	  str2=str.charAt(i)+str.substring(0,i);
    	  else
    		  str2=str.charAt(i)+str.substring(0,i)+str.substring(i+1);
    	 if(str2.compareTo(st)<0)  
    	 {	  
            st=str2;
    		 
    	 }
    	  str2=" ";
    	  
    	 
      }
      if(st==str)
    	  System.out.println(str);
      else
    	  System.out.println(st);
    	  
      
		}
      
		
	}

}
