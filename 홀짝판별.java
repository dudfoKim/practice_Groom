import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.print("odd");
		}
	}
}
