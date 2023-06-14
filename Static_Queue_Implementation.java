package Stack_Questions;

public class Static_Queue_Implementation {

	     protected int data[];
	     int front=0;
	     int size=0;
	     public Static_Queue_Implementation ()
	     {
	    	 this.data=new int[5];
	     }
	     public Static_Queue_Implementation (int item)
	     {
	    	 this.data=new int[item];
	     }
	     public void enqueue(int item)
	     {
	    	       int i=(this.size+this.front)%this.data.length;
	               this.data[i]=item;
	               size++;
	    	 
	     }
	     public int dequeue()
	     {
	    	    int rv= this.data[this.front];
	    	 	    	  front=(front+1)%data.length;

	    	   size--;
	    	   return rv;

	     }
	     public int getfront()
	     {
	    	 return this.data[this.front];
	     }
	     public boolean isFull()
	     {
	    	 return this.size==this.data.length;
	     }
	     public boolean isEmpty()
	     {
	    	 return this.size==0;
	     }
	     public void display()
	     {
	    	 for(int i=0;i<size;i++)
	    	 {
	    		 int idx=(this.front+i)%this.data.length;
	    		 System.out.print(data[idx]+" ");
	    	 }
	     }
	

}
