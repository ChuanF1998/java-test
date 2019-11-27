/*  任意输入三个数，然后按从大到小的顺序输出  */

import java.util.Scanner;
public class Test06
{
      public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.println("请输入数字A：");
            int a=input.nextInt();
            System.out.println("请输入数字B：");
            int b=input.nextInt();
            System.out.println("请输入数字C：");
            int c=input.nextInt();
            if(a>b){
                   if(b>c){
                        System.out.println(a+" "+b+" "+c);
                   }
                   else if(c>a){
                        System.out.println(c+" "+a+" "+b);
                   }
                   else{
                        System.out.println(a+" "+c+" "+b);
                   }
            }
          else{
                   if(a>c){
                        System.out.println(b+" "+a+" "+c);
                   }
                   else if(c>b){
                        System.out.println(c+" "+b+" "+a);
                   }
                   else{
                        System.out.println(b+" "+c+" "+a);
                   }
          }
     }
}