import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(sum<=n)
		{
			sum += i;
			i++;
		}
		ㅁimport java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=6; i++)
		{
			int sum = 0;
			
			for(int j=1; j<=6; j++)
			{
				sum = i;
				sum += j;
				
				if(sum==n)
				{
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
		System.out.println(i-1);
	}
}
