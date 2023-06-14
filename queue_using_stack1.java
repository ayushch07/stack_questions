 package Stack_Questions;

import java.util.Stack;

public class queue_using_stack1 {
	Stack<Integer> st1=new Stack<>();

	Stack<Integer> st2=new Stack<>();

	  public void enqueue(int x)
	  {  // Move all elements from s1 to s2 
	        st1.push(x);
	 
		  
		  
	  }
	  public void dequeue()
	  {
		while(!st1.isEmpty())
		{
			st2.push(st1.pop());
		}
		int ans=st2.pop();
		while(!st2.isEmpty())
		{
			st1.push(st2.pop());
		}
		  System.out.println(ans);
	  }
	  public int peek()
	  {
		 

			while(!st1.isEmpty())
			{
				st2.push(st1.pop());
			}
			int ans=st2.peek();
			while(!st2.isEmpty())
			{
				st1.push(st2.pop());
			}
			return ans;
	  }
	 public boolean empty()
	 {
		 if(st1.isEmpty() && st2.isEmpty())
			 return true;
		 else
			 return false;
	 }


		
		
	

	
  public static void main(String[] args)
  {
	  queue_using_stack1 obj=new queue_using_stack1();
	  obj.enqueue(0);
	  obj.enqueue(1);
	  obj.enqueue(2);
	  obj.enqueue(3);
	  
	 
	  
	  obj.enqueue(4);
//	  obj.enqueue(10);
	  obj.dequeue();
	  obj.dequeue();
	  obj.dequeue();
	  obj.dequeue();
	

		 
	 
	 
	  
  }
	
	

}
