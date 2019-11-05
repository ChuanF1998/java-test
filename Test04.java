/*判断用户输入的数是否是偶数并且画出他们的流程图*/

import java.util.Scanner;
public class Test04
{
       public static void main(String[] args){
             Scanner input=new Scanner(System.in);
             while(true){
                int n=input.nextInt();
                if(n%2==0){
                     System.out.println("它是偶数！");
                }
                else{
                    System.out.println("它不是偶数！");
                 }
             }
      }
}