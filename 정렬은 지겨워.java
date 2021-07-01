import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mod = new int[n];
		PriorityQueue<Integer> jjak = new PriorityQueue<Integer>();
		PriorityQueue<Integer> hol = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++)
		{
			int temp = sc.nextInt();

			if(temp%2==0)
			{
				mod[i] = 0;
				jjak.add(temp);
			}			
			else
			{
				mod[i] = 1;
				hol.add(temp);
			}
		}
		
		for(int i=0; i<n; i++)
		{
			if(mod[i]==0)
			{
				System.out.print(jjak.poll() + " ");
			}
			else
			{
				System.out.print(hol.poll() + " ");
			}
		}
	}
} 
