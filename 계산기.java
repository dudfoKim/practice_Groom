import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		String[] input = temp.split(" ");
		long a = Integer.parseInt(input[0]);
		long b = Integer.parseInt(input[2]);
		String operation = input[1];
		
		if(operation.equals("+"))
		{
			System.out.print(a+b);
		}
		else if(operation.equals("-"))
		{
			System.out.print(a-b);
		}
		else if(operation.equals("*"))
		{
			System.out.print(a*b);
		}
		else if(operation.equals("/"))
		{
				if(b==0 || a==0)
				{
		//		System.out.print(String.format("%.2f", 0));
					System.out.print(0);
				}
				else
				{
					System.out.print(String.format("%.2f", (float)a/b));
				}
		}
	}
}
