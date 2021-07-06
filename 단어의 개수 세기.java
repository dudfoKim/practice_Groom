import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] temp = input.split(" ");
		int cnt = 0;

		for(int i=0; i<temp.length; i++)
		{
			if(temp[i].length()>0)
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
