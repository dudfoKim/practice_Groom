import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double result = (n/2)*((n/2)*Math.sqrt(3))/2;
		
		System.out.println(String.format("%.2f", result*12));		
	}
} 
