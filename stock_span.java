package Stack_Questions;

import java.util.Stack;

public class stock_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,5,0,12,5};
       span(arr);
		
	}

	private static void span(int[] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		int store[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!st.empty() && arr[i]>arr[st.peek()])
			{
				st.pop();
			}
			if(st.isEmpty())
			{
				store[i]=i+1;
			}
			else
			{
				store[i]=i-st.peek();
			}
			st.push(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "+store[i]);
		}
		
	}

}
