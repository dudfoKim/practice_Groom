import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int sum = 0;
		int[] dp = new int[input.length()];
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)=='O' || input.charAt(i)=='o' || input.charAt(i)=='0')
			{
				dp[i] = 1;
			}
		}
		
		sum += dp[0];
		
		for(int i=1; i<dp.length; i++)
		{
			if(dp[i]==1)
			{
				if(dp[i-1]!=0)
				{
					dp[i] = dp[i-1] + 1;
				}
				else
				{
					dp[i] = 1;
				}
			}
			else
			{
				dp[i] = 0;
			}
			
			sum += dp[i];
		}
		
		System.out.println(sum);
	}
}
