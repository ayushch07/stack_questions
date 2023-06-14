package Stack_Questions;

import java.util.Stack;

public class MIn_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str[]= {"push", "push", "push", "getMin", "pop","top","getMin"};
		 int arr[]= {-2,0,-3};
		 Stack<Integer> st=new Stack<>();
		 int min=Integer.MIN_VALUE;
   
		 st.push(-2);
		 st.push(0);
			
		 st.push(-3);
			System.out.print(st);
		  
//		  // System.out.print(stf);
//		   for(int i=0;i<str.length;i++)
//		   {
//			   String stf=str[i];
//			   if(stf=="push")
//			   {
//				   st.push(arr[i]);
//		
//			   }
////			   else if(stf=="pop")
////			   {
////				   st.pop();
////			   }
//			   else if(stf=="getMin")
//			   {
//				   while(!st.isEmpty())
//				   {
//					   int x=st.peek();
//					   
//					   min=Math.min(min, x);
//					   st.pop();
//				   }
//			   }
//			   
//			   
//			   
//			   
//			   
//		   }
		   int y=st.peek();
		   st.pop();
		   System.out.print(y+" "+st.peek()+" "+min);
		   
		 

	}

}
