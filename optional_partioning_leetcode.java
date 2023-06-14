package Stack_Questions;

import java.util.HashSet;

public class optional_partioning_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abacaba";
		int k=0;
		 HashSet<Character> set=new HashSet();  
		 set.add('a');
		 set.add('b');
		 System.out.println(set.size());
		for(int i=0;i<str.length();i++)
		{
			
			
			if(set.contains(str.charAt(i)))
			{
				k++;
				set=new HashSet<>();
				set.add(str.charAt(i));
			}
			else
			{
				set.add(str.charAt(i));
				
			}
				
	
		}
		if(!set.isEmpty())
			k++;
		System.out.print(k);

	

	}

}
