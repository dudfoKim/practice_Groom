import java.util.Scanner;

class Main
{
     public static void main(String[] args) throws Exception
     {
         Scanner sc = new Scanner(System.in);
         int year = sc.nextInt();

         if(year%4==0)
         {
             if(year%100==0 && year%400!=0)
             {
                 System.out.println("Not Leap Year");
                 return;
             }

             System.out.println("Leap Year");
             return;
         }

         System.out.println("Not Leap Year");
     }
}
