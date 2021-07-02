import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<n; i++)
		{
			String temp = i + "";
			
			for(int j=0; j<temp.length(); j++)
			{				
				if(temp.charAt(j)=='3' || temp.charAt(j)=='6' || temp.charAt(j)=='9')
				{
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
