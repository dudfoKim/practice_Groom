import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		String result = "X";
		
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int key = sc.nextInt();
		int start = 0;
		int end = size-1;
		int index = 0;
		
		while(start<=end)
		{
			index = (start+end)/2;

			if(arr[index]==key)
			{
				result = (index+1) + "";
				break;
			}
			else if(arr[index]>key)
			{
				end = index-1;
			}
			else if(arr[index]<key)
			{
				start = index+1;
			}
		}
		
		System.out.println(result);
	}
}
