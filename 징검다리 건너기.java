import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] poison = new int[n];
		int[] dp = new int[n];
		int temp = 0;
		
		for(int i=0; i<n; i++)
		{
			poison[i] = sc.nextInt();
		}

		dp[0] = poison[0];
		dp[1] = Math.min(dp[0]+poison[1], poison[1]);
		dp[2] = Math.min(dp[1]+poison[2], poison[2]);
		
		for(int i=3; i<n ; i++)
		{
			temp = Integer.MAX_VALUE;
			
			temp = Math.min(temp, (int)(dp[i-3]+poison[i]));
			temp = Math.min(temp, (int)(dp[i-2]+poison[i]));
			temp = Math.min(temp, (int)(dp[i-1]+poison[i]));
			
			dp[i] = temp;
		}
		
		temp = Math.min(dp[n-3], dp[n-2]);
		temp = Math.min(temp, dp[n-1]);
		
		System.out.println(temp);
	}
}
