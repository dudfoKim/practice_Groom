import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)!=' ')
			{
				System.out.print(input.charAt(i));
			}
		}
	}
}
