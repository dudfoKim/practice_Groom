import java.util.Scanner;

class Main {
	
	public static long facto(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*facto(n-1);	
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(facto(n));
	}
}
