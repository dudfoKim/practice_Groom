import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = (a+b+c)/2;
		double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println(String.format("%.2f", result));
	}
}
