package Stack_Questions;

public class Dynamic_Queue_Implementation extends Static_Queue_Implementation{

         public void enqueue(int item)
         {
        	 if(super.isFull())
        	 {
        		 int arr[]=new int[2*this.data.length];
        		 for(int i=0;i<data.length;i++)
        		 {
        			 int idx=(this.front+i)%this.data.length;
        			 arr[i]=data[idx];
        			 
        		 }
        		 this.data=arr;
        		 this.front=0;
        	 }
        	 super.enqueue(item);
         }

}
