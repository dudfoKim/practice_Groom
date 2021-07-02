import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String x1 = br.readLine();
		String[] x2 = x1.split(" ");
		
		int size = Integer.parseInt(input);
		long[] ram = new long[size];
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<size; i++)
		{
			ram[i] = Integer.parseInt(x2[i]);
		}
		
		for(int i=0; i<size; i++)
		{
			if((ram[i]-1 & ram[i]) != 0)
			{
				cnt++;
				list.add(i+1);
			}
		}
		
		if(cnt==0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(cnt);
			
			for(int i=0; i<list.size(); i++)
			{
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
