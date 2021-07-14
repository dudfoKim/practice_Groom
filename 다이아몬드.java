import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ban = n/2;
		
		for(int i=0; i<n; i++)
		{
			if(n%2==1)
			{
				if(i<ban)
				{
					for(int j=0; j<ban-i; j++)
					{
						System.out.print(" ");
					}
					for(int j=0; j<(2*i)+1; j++)
					{
						System.out.print("*");
					}
				}
				else if(i>ban)
				{
					for(int j=i-ban; j>0; j--)
					{
						System.out.print(" ");
					}
					for(int j=0; j<((n-i-1)*2)+1; j++)
					{
						System.out.print("*");
					}
				}
				else
				{
					for(int j=0; j<(ban*2)+1; j++)
					{
						System.out.print("*");
					}
				}
			}
			else
			{
				if(i<ban)
				{
					for(int j=0; j<ban-i; j++)
					{
						System.out.print(" ");
					}
					for(int j=0; j<(2*i)+1; j++)
					{
						System.out.print("*");
					}
				}
				else if(i>ban)
				{
					for(int j=i-ban; j>=0; j--)
					{
						System.out.print(" ");
					}
					for(int j=0; j<((n-i-1)*2)+1; j++)
					{
						System.out.print("*");
					}
				}
				else
				{
					for(int j=0; j<i-(ban-1); j++)
					{
						System.out.print(" ");
					}
					for(int j=0; j<((ban-1)*2)+1; j++)
					{
						System.out.print("*");
					}
				}
			}
			
			System.out.println();
		}
	}
}
