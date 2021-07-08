import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int index = 0;
		int[] arr = new int[n];
				
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			
			if(arr[i]>max)
			{
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max + " " + (index+1));
	}
}
