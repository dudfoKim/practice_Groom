import java.util.Scanner;

class Main
{
     public static void main(String[] args) throws Exception
     {
         Scanner sc = new Scanner(System.in);
         int firstX = sc.nextInt();
         int firstY = sc.nextInt();
         int nextX = sc.nextInt();
         int nextY = sc.nextInt();

         System.out.println(String.format("%.2f", Math.sqrt(Math.pow(nextX-firstX, 2)+Math.pow(nextY-firstY, 2))));
     }
}
