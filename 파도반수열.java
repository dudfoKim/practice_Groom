import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n<4)
		{
			System.out.println(1);
		}
		else if(n<6)
		{
			System.out.println(2);
		}
		else
		{
			int[] dp = new int[n];
		
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 2;
			dp[4] = 2;

			for(int i=5; i<n; i++)
			{
				dp[i] = dp[i-1] + dp[i-5];				
			}
			
			System.out.println(dp[n-1]);
		}
	}
}
