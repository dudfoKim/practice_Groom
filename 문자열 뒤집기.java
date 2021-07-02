import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		for(int i=0; i<input.length(); i++)
		{
			System.out.print(input.charAt(input.length()-1-i));
		}
	}
}
