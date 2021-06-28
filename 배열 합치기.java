import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = new int[a+b];
		
		for(int i=0; i<a+b; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		for(int i=0; i<a+b; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
