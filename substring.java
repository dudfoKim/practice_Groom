import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String temp = br.readLine();
		String[] index = temp.split(" ");
		
System.out.println(input.substring(Integer.parseInt(index[0])-1, Integer.parseInt(index[0])+Integer.parseInt(index[1])-1));
	}
}
