//����������46������������ʣ�������

import java.util.Scanner;
public class Test02
{
      public static void main(String[] args){
               Scanner input=new Scanner(System.in);
               int n=input.nextInt();
               int week=n/7;
               int day=n%7;
              System.out.println(week+" �� "+day+" ��");
      }
}