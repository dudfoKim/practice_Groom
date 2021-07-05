import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int m = 7;
		
		for(int i=0; i<n; i++)
		{
			for(int k=0; k<m-i; k++)
			{
				System.out.print(0);
			}
			for(int j=1; j<=(i+1); j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}		
	}
}
