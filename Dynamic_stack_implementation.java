package Stack_Questions;

public class Dynamic_stack_implementation {
                protected int data[];
                int top=0;
                public  Dynamic_stack_implementation(){//Ye static stack hai.
                	this.data=new int[5];
                	
                }
                public Dynamic_stack_implementation(int capacity)
                {
                	this.data=new int[capacity];
                }
                public boolean isEmpty()
                {
                	
                	return top==0;
                }
                public boolean isFull()
                {
                	return top==data.length;
                }
                public void push(int item)
                {
                	this.data[this.top]=item;
                	this.top++;
                }
                public int pop()
                {
                	this.top--;
                	 return this.data[top];
                }
                public int peek()
                {
                	return this.data[top-1];
                }
                public int size()
                {
                	return top;
                }
                public void display() {
                	for(int i=0;i<top;i++)
                	{
                		System.out.print(this.data[i]+" ");
                	}
                }

}
