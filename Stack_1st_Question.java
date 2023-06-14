package Stack_Questions;

import java.util.Stack;

public class Stack_1st_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<Integer>();
          st.push(10);
          st.push(20);
          st.push(30);
          st.push(40);
          st.push(50);
          System.out.println(st);
          System.out.println("********");
          
          reverse(st);
          System.out.println(st);
          
	}

	public static void reverse(Stack<Integer> st) {
		
		// TODO Auto-generated method stub
		if(st.size()==0)
		{
			return;
		}
		int x=st.pop();
		reverse(st);
		insert_data(st,x);
		
	}

	private static void insert_data(Stack<Integer> st, int x) {
		// TODO Auto-generated method stub
		
		if(st.size()==0)
		{
			st.push(x);
			return;
		}
		int y=st.pop();
		insert_data(st,x);
		st.push(y);
		
	}
	
	

}
