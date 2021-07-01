import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int i=a; i<=b; i++)
		{
			for(int j=2; (j*j)<=i; j++)
			{
				if(i/(j*j)==1 && i%(j*j)==0)
				{
					sum += i;
					min = Math.min(min, i);
				}
			}
		}
		
		System.out.println(min + " " + sum);
	}
}
