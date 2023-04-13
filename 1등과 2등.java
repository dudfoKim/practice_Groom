https://yoloaeee.tistory.com/327

=====================================

import java.util.Scanner;

class Main
{
public static void main(String[] args) throws Exception
     {
          Scanner sc = new Scanner(System.in);
          String input = sc.nextLine();
          int index = input.indexOf("12");

          if(input.length()==1)
          {
               System.out.println("No");
               return;
          }

          if(index!=-1)
          {
               input = input.substring(0, index) + input.substring(index+2, input.length());
          }

          index = input.indexOf("21");
          
          if(index!=-1)
          {
               input = input.substring(0, index) + input.substring(index+2, input.length());
          }

          System.out.println(index==-1?"No":"Yes");
          sc.close();
     }
}
