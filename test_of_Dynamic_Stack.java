package Stack_Questions;

public class test_of_Dynamic_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dynamic_stack_implementation s=new  D_Stack_Implementation ();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(8);
		s.push(90);
		s.display();
		System.out.println(s.peek());
	}

}
