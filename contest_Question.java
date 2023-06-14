package Stack_Questions;

public class contest_Question {

	public static void main(String[] args)
	{
		 String str="hghhghgghh";
		String d="hg";
		int arr[]= {2,3};
		int max=Integer.MIN_VALUE;
		int v=0;
		int c=0;
		if(str.compareTo(d)==0)
			System.out.println("Bekar");
	
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				String val=str.substring(i,j+1);
				c=0;
				for(int k=0;k<val.length();k++)
				{
					 
					for(int m=0;m<d.length();m++)
					{
						
						if(val.charAt(k)==d.charAt(m))
							v=arr[m];
						
						c=c+v;
					}
						 v=val.charAt(k);
						  v=v-'a'+1;
						  
						  
                					
					}
			
				max=Math.max(max,c);
			}
		   	
			
		}
		System.out.print(max);
	}
}
