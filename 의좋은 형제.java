https://yoloaeee.tistory.com/m/73


import java.util.Scanner;

class Main
{
     public static void main(String[] args) throws Exception
     {
         Scanner sc = new Scanner(System.in);

         int jw = sc.nextInt();
         int sw = sc.nextInt();
         int day = sc.nextInt();
         int cnt = 0;

         while(cnt!=day)
         {
              int plus = 0;

              if(cnt%2==0)
              {
                   plus = jw;

                   if(jw%2==1)
                   {
                        plus++;
                   }

                   plus /= 2;
                   jw /= 2;
                   sw += plus;
              }
              else
              {
                   plus = sw;

                   if(sw%2==1)
                   {
                        plus++;
                   }

                   plus /= 2;
                   sw /= 2;
                   7jw += plus;
              }

              cnt++;
         }

         System.out.println(jw + " " + sw);
     }
}
