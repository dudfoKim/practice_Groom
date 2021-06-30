import java.util.Scanner;
import java.util.Arrays;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] coin = new long[n];
		long result = -1;
		
		for(int i=0; i<n; i++)
		{
			coin[i] = sc.nextLong();
		}
		
		if(n==1)
		{
			if(coin[0]<=0)
			{
				result = 0;
			}
			else
			{
				result = 0;
			}
		}
		else
		{
			long[] dp = new long[n];
			dp[0] = coin[0];

			for(int i=1; i<n; i++)
			{
				dp[i] = Math.max(dp[i-1]+coin[i], coin[i]);
			}

			Arrays.sort(dp);

			if(dp[dp.length-1]<=0)
			{
				result = 0;
			}
			else
			{
				result = Math.max(coin[0], dp[dp.length-1]);
			}
		}
		
		System.out.println(result);
	}
}
