package Stack_Questions;

import java.util.Scanner;
import java.util.Stack;

public class smart_Keypad {
	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);

	        
		 String n=sc.next();
	       // System.out.println(n);
	       check(n);
	       
	        
	}
	private static void check(String n) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
	     char ch=n.charAt(0);
	     String str=table[ch-'0'];
	     for(int i=str.length()-1;i>=0;i--)
	     {
	    	 st.push(str.charAt(i));
	     }
	    // char c=n.charAt(1);
	    // String str2=table[c-'0'];
	    System.out.print(st);
	      char c=n.charAt(1);
	    String str2=table[c-'0'];
	    System.out.println(str2); 
	    while(!st.isEmpty())
	    {
	    	
	     for(int i=0;i<str2.length();i++)
	    	 
	     {
	    
	    	 char p=st.peek();
	    	 char p2=str2.charAt(i);
	    	 System.out.println(p+""+p2);
	    	 
	    	 
	     }
	     st.pop();
	    }
	                        	     
  		
	}

}
