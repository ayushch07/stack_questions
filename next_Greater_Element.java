 package Stack_Questions;

import java.util.Stack;

public class next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {4,1,2,3};
		  nge(arr);
		  

	}
	public static void nge(int arr[])
	{
		Stack<Integer> st=new Stack<>();
		int nge[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]>arr[st.peek()])
			{
				int ii=st.pop();
				nge[ii]=arr[i];
			}
			st.push(i);
		
		}
		while(!st.isEmpty())
		{
		   int ii=st.pop();
		   nge[ii]=-1;
			
		}
		for(int i=0;i<nge.length;i++)
		{
			System.out.println(arr[i]+" "+ nge[i]);
		}
	}

}
