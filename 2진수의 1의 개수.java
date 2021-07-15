import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String toBinary = Integer.toBinaryString(n);
		int cnt = 0;
		
		for(int i=0; i<toBinary.length(); i++)
		{
			if(toBinary.charAt(i)=='1')
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
