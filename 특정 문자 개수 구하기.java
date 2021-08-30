import java.util.Scanner;

class Main
{
     public static void main(String[] args) throws Exception
     {
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         char compare = sc.next().charAt(0);
         int cnt = 0;

         for(int i=0; i<input.length(); i++)
         {
             if(input.charAt(i)==compare)
             {
                 cnt++;
             }
         }

         System.out.println(cnt);
     }
}
