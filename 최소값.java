import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++)
		{
			int temp = sc.nextInt();
			min = Math.min(min, temp);
		}
		
		System.out.println(min);
	}
}
