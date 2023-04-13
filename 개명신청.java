https://yoloaeee.tistory.com/326

========================================
  
import java.util.Scanner;

class Main
{
     public static void main(String[] args) throws Exception 
     {
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         int index = -1;

         if(input.length()==2)
         {
              index = input.charAt(0) - input.charAt(1);

              if(index<0)
              {
                 System.out.println(input.charAt(0));
              }
              else
              {
                 System.out.println(input.charAt(1));
              }

              return;
         }

         for(int i=0; i<input.length()-1; i++)
         {
              if(input.charAt(i)>input.charAt(i+1))
              {
                  index = i;
                 break;
              }
              else if(input.charAt(i)==input.charAt(i+1))
             {
                 index = -2;
              }
         }

         if(index<0)
         {
              System.out.println(input.substring(0, input.length()-1));
              return;
         }

         System.out.println(input.substring(0, index) + input.substring(index+1, input.length()));
         sc.close();
     }
}
