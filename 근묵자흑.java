 https://yoloaeee.tistory.com/m/78


import java.util.Scanner;
import java.util.Arrays;


class Main 
{
     // 반복문 종료조건 설정(배열값이 전부 똑같은지 확인)
     public static boolean chk(int a, int b)
     {
         return a==b?true:false;
     }

     public static void main(String[] args) throws Exception 
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();         
         int[] arr = new int[n];
         int cnt = 0;

         for(int i=0; i<n; i++)
         {
              arr[i] = sc.nextInt();
         }

         // 조건 확인 전 배열 정렬
         Arrays.sort(arr);

         while(!chk(arr[0], arr[n-1]))
         {
              int index = 0;
              int loop = 1;

              // 배열의 첫번째 값과 다른 값이 있는지 확인
              for(int i=1; i<n; i++)
              {
                   if(arr[0]!=arr[i])
                   {
                        index = i;
                        break;
                   }
              }

              // 배열의 첫 번째 값으로 전체 설정(설정 반복은 최대 k까지)
              while(index<n && loop<k)
              {
                   arr[index] = arr[0];
                   loop++;
                   index++;
              }

              cnt++;
         }

         System.out.println(cnt);
     }
}

 
import java.util.Scanner;
import java.util.Arrays;

class Main 
{
     // 반복문 종료조건 설정(배열값이 전부 똑같은지 확인)
     public static boolean chk(int a, int b)
     {
         return a==b?true:false;
     }

     public static void main(String[] args) throws Exception 
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();         
         int[] arr = new int[n];
         int cnt = 0;

         for(int i=0; i<n; i++)
         {
              arr[i] = sc.nextInt();
         }

         // 조건 확인 전 배열 정렬
         Arrays.sort(arr);

         while(!chk(arr[0], arr[n-1]))
         {
              int index = 0;
              int loop = 1;

              // 배열의 첫번째 값과 다른 값이 있는지 확인
              for(int i=1; i<n; i++)
              {
                   if(arr[0]!=arr[i])
                   {
                        index = i;
                        break;
                   }
              }

              // 배열의 첫 번째 값으로 전체 설정(설정 반복은 최대 k까지)
              while(index<n && loop<k)
              {
                   arr[index] = arr[0];
                   loop++;
                   index++;
              }

              cnt++;
         }

         System.out.println(cnt);
     }
}

 
