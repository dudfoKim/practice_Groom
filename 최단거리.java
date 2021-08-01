import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int min = arr[1]-arr[0];
		
		for(int i=2; i<n; i++)
		{
			min = Math.min(min, arr[i]-arr[i-1]);
		}
		
		System.out.println(min);
	}
}
