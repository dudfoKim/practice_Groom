import java.io.*;
class Main {
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int ds = Integer.parseInt(input);
		int result = 0;
		
		for(int i=1; i<=ds ;i++)
		{
			if(ds%i==0)
			{
				result += i;
			}
		}
		
		System.out.println(result);
	}
}
