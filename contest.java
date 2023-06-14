package Stack_Questions;
import java.util.*;
public class contest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0)
           {
//               int l=sc.nextInt();
//                 int n=sc.nextInt();
              String str=sc.next();
              int n=sc.nextInt();
       
          String s=Integer.toString(n);
          int e=0;
           if((s.charAt(0)=='0' || s.charAt(0)=='1') && str.charAt(str.length()-1)!='0')
          {
        	  System.out.println(str.substring(e)+s);
        	  
          }
            
           
          else
          {
   
         for(int i=str.length()-1;i>=0;i--)

          {
        	     if(str.charAt(i)<=s.charAt(0))
        	  {
        		  
        		  e=i;
        		  
        	  }
        	     
        	  
        	  
          }
        
          System.out.println(str.substring(0,e)+s+str.substring(e));
          }
               
           }
         
	}

}
