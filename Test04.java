/*�ж��û���������Ƿ���ż�����һ������ǵ�����ͼ*/

import java.util.Scanner;
public class Test04
{
       public static void main(String[] args){
             Scanner input=new Scanner(System.in);
             while(true){
                int n=input.nextInt();
                if(n%2==0){
                     System.out.println("����ż����");
                }
                else{
                    System.out.println("������ż����");
                 }
             }
      }
}