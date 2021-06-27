import java.io.*;
class Main {
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] count = new int[26];

		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)>=65 && input.charAt(i)<=90)
			{
				count[input.charAt(i)-65]++;
			}
			else if(input.charAt(i)>=97 && input.charAt(i)<=122)
			{
				count[input.charAt(i)-97]++;
			}
		}
		
		for(int i=0; i<count.length; i++)
		{
			System.out.println((char)(i+97) + " : " + count[i]);
		}
	}
}
