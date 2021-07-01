import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		minute += 50;
		
		if(minute>=60)
		{
			hour += 1;
			minute -= 60;
		}
		if(hour>=24)
		{
			hour -= 24;
		}
		
		System.out.println(hour + " " + minute);
	}
}
