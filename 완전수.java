import java.util.Scanner;
class Main
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++)
		{
			int sum = 0;
			
			for(int j=1; j<i; j++)
			{
				if(i%j==0)
				{
					sum = sum + j;
				}
			}
			
			if(i==sum)
			{
				System.out.print(i + " ");
			}
		}
	}
}
