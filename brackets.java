package Stack_Questions;

import java.util.Stack;

public class brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="[()))]";
		
		if(check(str))
		System.out.print("True");
		else
			System.out.print("False");
			
	}

	private static boolean check(String str) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
		int c=0;
		 if(str.length()%2!=0)
			 return false;
		for(int i=0;i<str.length();i++)
		{
			
			while(!st.isEmpty() && str.charAt(i)!=st.peek())
			{
					st.pop();	
			}
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
			{	st.push(str.charAt(i));
			
			
		}
		System.out.print(c);
	
		//st.pop();
		if(!st.isEmpty())
		
	
			return false;
		else
			return true;
			
	}

}
