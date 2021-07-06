import java.util.Scanner;
import java.util.Stack;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int length = input.length()-1;
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0; i<=length; i++)
		{
			if(i!=length/2)
			{
				if(i<length/2)
				{
					s.add(input.charAt(i));
				}
				else
				{
					if(s.contains(input.charAt(i)))
					{
						s.pop();
					}
					else
					{
						break;
					}
				}
			}
		}
		
		System.out.println(s.isEmpty()==true?"Palindrome":"Not Palindrome");
	}
}
