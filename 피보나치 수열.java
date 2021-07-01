import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		int sum = dp[0] + dp[1];
		
		for(int i=2; i<=n; i++)
		{
			dp[i] = dp[i-1] + dp[i-2];
			sum += dp[i];
		}
		
		System.out.println(sum);
	}
}
