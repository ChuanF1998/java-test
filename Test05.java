/*ʵ�ּ��������ܣ��û����������������ҵ��û�
	��1ʱ������������ĺ�
	��2ʱ������������Ĳ�
	��3ʱ������������Ļ�
	��4ʱ���������������
	�����������������*/

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
                       System.out.println("������֮��Ϊ "+(num1+num2));
                }
                else if(option==2){
                       System.out.println("������֮��Ϊ "+(num1-num2));
                }
                else if(option==3){
                       System.out.println("������֮��Ϊ "+(num1*num2));
                }
                else if(option==5){
                       System.out.println("������֮��Ϊ "+(num1/num2));
                }
                else{
                       System.out.println("����������Ϊ "+(num1%num2));
                }
         }
    }
}
