/*实现计算器功能，用户输入两个数，并且当用户
	按1时：求出两个数的和
	按2时：求出两个数的差
	按3时：求出两个数的积
	按4时：求出两个数的商
	否则，求出两个数的余*/

import java.util.Scanner;
public class Test05
{
     public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         int num1=input.nextInt();
         int num2=input.nextInt();
         while(true){
                int option=input.nextInt();
                if(option==1){
                       System.out.println("两个数之和为 "+(num1+num2));
                }
                else if(option==2){
                       System.out.println("两个数之差为 "+(num1-num2));
                }
                else if(option==3){
                       System.out.println("两个数之积为 "+(num1*num2));
                }
                else if(option==5){
                       System.out.println("两个数之商为 "+(num1/num2));
                }
                else{
                       System.out.println("两个数求余为 "+(num1%num2));
                }
         }
    }
}
