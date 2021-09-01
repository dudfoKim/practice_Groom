import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		arr[0] = 1;
		
		for(int i=1; i<n; i++)
		{
			arr[i] = (long)((long)(arr[i-1]) + (long)Math.pow((i+1), 2));
		}
		
		System.out.println(arr[n-1]);
	}
}
