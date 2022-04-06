https://yoloaeee.tistory.com/234

========================================

import java.util.Scanner;

class Main
{
     public static void main(String[] args) throws Exception
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         long[] money = new long[n]; // 일자별 수입
         long[] sum = new long[n+1]; // n일자까지의 수입합
         StringBuilder sb = new StringBuilder();

         // 입력값 처리
         for(int i=0; i<n; i++)
         {
              String temp = sc.next();
              String num = temp.substring(1);
              money[i] = Long.parseLong(num);

              if(temp.contains("-")) // - 값일 경우 -1을 곱한 후 저장
              {
                   money[i] *= -1;
              }
         }

         // dp배열 초기화 설정 및 실행
         sum[0] = money[0];

         for(int i=1; i<n; i++)
         {
              sum[i] = sum[i-1] + money[i];
         }

         // 결과값 출력
         for(int i=0; i<m; i++)
         {
              int start = sc.nextInt()-1;
              int end = sc.nextInt()-1;
              long result = 0;

              // 1. 시작 인덱스가 1일 경우, dp배열 sum의 end 인덱스 그대로 출력
              if(start==0)
              {
                   result = sum[end];
              }
              // 2. 시작 인덱스 == 끝 인덱스일 경우 money 배열 그대로 출력
              else if(start==end)
              {
                   result = money[start];
              }
              // 3. 그 외 모든 경우는 dp배열의 end 인덱스 - dp 배열의 (start-1) 인덱스 값 출력
              else
              {
                   result = sum[end] - sum[start-1];
              }
              if(result<0)
              {
                   sb.append(result);
              }
              // 양수일 경우에는 임의로 '+' 기호 붙여서 출력
              else
              {
                   sb.append("+" + result);
              }

              sb.append("\n");
          }

          System.out.println(sb.toString().substring(0, sb.length()-1));
          sc.close();
     }
}
