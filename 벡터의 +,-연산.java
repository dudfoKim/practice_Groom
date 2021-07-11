import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		double[] a = new double[2];
		double[] b = new double[2];
		
		a[0] = sc.nextDouble();
		a[1] = sc.nextDouble();
		b[0] = sc.nextDouble();
		b[1] = sc.nextDouble();
		
		String buho = sc.next();
		
		if(buho.equals("+"))
		{
			System.out.println(String.format("%.2f", a[0]+b[0]) + " " + String.format("%.2f", a[1]+b[1]));
		}
		else
		{
			System.out.println(String.format("%.2f", a[0]-b[0]) + " " + String.format("%.2f", a[1]-b[1]));
		}
	}
}
