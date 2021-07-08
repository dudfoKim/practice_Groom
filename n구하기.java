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
		
		System.out.println(i-1);
	}
}
