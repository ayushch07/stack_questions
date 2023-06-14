package Stack_Questions;

public class first_negative_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12 ,-1 ,-7, 8 ,-15 ,30, 16, 28};
		int g=3;
		 int k=g;
		int a[]=new int[(arr.length-k)+1];
		int c=0;
		for(int i=0;i<=(arr.length-g);i++)
		{
			for(int m=i;m<k;m++)
			{
				if(arr[m]<0)
				{
					a[c++]=arr[m];
					break;
				}
			
				
			}
			
			k++;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		
		

	}

}
