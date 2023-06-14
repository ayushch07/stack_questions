package Stack_Questions;

public class test_of_Dynamic_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Queue_Implementation q=new Dynamic_Queue_Implementation();
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		//q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(15);
		q.display();
		
	}

}
