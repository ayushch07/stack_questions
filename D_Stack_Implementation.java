package Stack_Questions;

public class D_Stack_Implementation extends Dynamic_stack_implementation {
	public void push(int item)
	{
		if(this.isFull())
		{
			int arr[]=new int[2*this.data.length];
			for(int i=0;i<this.data.length;i++)
			{
				arr[i]=this.data[i];
				
			}
			this.data=arr;
		}
		super.push(item);
	}

}
