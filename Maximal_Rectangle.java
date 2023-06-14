package Stack_Questions;

public class Maximal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{}};
		int a[][]=new int[m][n];
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(i==arr.length-1)
					a[i][j]=arr[i][j];
				else
					a[i][j]=arr[i][j]==1 ? a[i+1][j]+1 : 0;
			}
			ans=Math.max(ans, Area(a[i]));
		}

	}

}
