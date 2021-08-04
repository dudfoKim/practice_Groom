import java.util.Scanner;
import java.util.HashMap;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] temp = input.split(" ");
		String in = temp[0];
		String chk = temp[1];
		HashMap<Character, Integer> inMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> chkMap = new HashMap<Character, Integer>();

		for(int i=0; i<in.length(); i++)
		{
			inMap.put(in.charAt(i), 1);
		}
		for(int i=0; i<chk.length(); i++)
		{
			chkMap.put(chk.charAt(i), 1);
		}
		
		if(inMap.size()==chkMap.size())
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
