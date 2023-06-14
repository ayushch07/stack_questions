.package Stack_Questions;
import java.util.*;


public class nge_circular_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  arr[i]=sc.nextInt();
		  nge(arr,n);
		  

	}
	public static void nge(int arr[],int n)
	{
		Stack<Integer> st=new Stack<>();
		int nge[]=new int[arr.length];
		for(int i=0;i<2*arr.length;i++)
		{
			while(!st.isEmpty() && arr[i%n]>arr[st.peek()])
			{
				int ii=st.pop();
				nge[ii]=arr[i%n];
			}
			if(i<n)
			{
			st.push(i%n);
			}
		}
		while(!st.isEmpty())
		{
		   int ii=st.pop();
		   nge[ii]=-1;
			
		}
		for(int i=0;i<nge.length;i++)
		{
			System.out.print(nge[i]+" ");
		}
	}

}



