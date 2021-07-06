import java.util.Scanner;

class Main
{
	public static double distance(int[] a, int X, int Y)
	{
		return Math.sqrt(Math.pow(Math.abs(a[0]-X), 2) + Math.pow(Math.abs(a[1]-Y), 2));
	}
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double compare = 0;
		int[][] stone = new int[n-1][2];
		int mokjeokX = sc.nextInt();
		int mokjeokY = sc.nextInt();
		
		for(int i=0; i<n-1; i++)
		{
			stone[i][0] = sc.nextInt();
			stone[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++)
		{
			if(i==0)
			{
				compare = distance(stone[i], mokjeokX, mokjeokY);
			}
			else
			{
				compare = Math.min(compare, distance(stone[i], mokjeokX, mokjeokY));
			}
		}
		
		System.out.print(String.format("%.3f", compare));
	}
}
