package Stack_Questions;
import java.util.*;

public class test_doubt {
 
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i].compareTo("+")==0)
			{
			
				int temp=st.pop();
				 int c=temp+st.peek();
				 st.push(temp);
				 st.push(c);
				 
			}
			else if(arr[i].compareTo("D")==0)
			{
				st.pop();
			}
			else
			{
				st.push(Integer.parseInt(arr[i]));
				
			}
		}
		int s=0;
		while(!st.isEmpty())
		{
			s+=st.pop();
		}
		System.out.print(s);
	}
}
