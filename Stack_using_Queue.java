package Stack_Questions;

public class Stack_using_Queue {
	     private Dynamic_Queue_Implementation data;
	     public Stack_using_Queue()
	     {
	    	 this.data=new Dynamic_Queue_Implementation();
	     }
	     public boolean isEmpty()
	     {
	    	 return this.data.isEmpty();
	     }
	     public int size()
	     {
	    	 return this.data.size;
	     }
	     public void push(int item) throws Exception
	     {
	    	 Dynamic_Queue_Implementation temp=new Dynamic_Queue_Implementation();
	    	 while(!this.data.isEmpty())
	    	 {
	    		 temp.enqueue(data.dequeue());
	    	 }
	    	 this.data.enqueue(item);
	    	 while(!temp.isEmpty())
	    	 {
	    		 data.enqueue(temp.dequeue());
	    	 }
	     }
	     public int pop() throws Exception{
	    	 return this.data.dequeue();
	     }

}
