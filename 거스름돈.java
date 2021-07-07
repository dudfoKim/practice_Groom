import java.util.Scanner;
import java.util.ArrayList;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] money = new int[]{500, 100, 50, 10};
		int i = 0;
		int sum = 1000-input;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(sum!=0)
		{
			list.add(sum/money[i]);
			sum = sum - (money[i]*(sum/money[i]));
			i++;
		}
		
		for(i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}
}
