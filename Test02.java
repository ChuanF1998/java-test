//根据天数（46）计算周数和剩余的天数

import java.util.Scanner;
public class Test02
{
      public static void main(String[] args){
               Scanner input=new Scanner(System.in);
               int n=input.nextInt();
               int week=n/7;
               int day=n%7;
              System.out.println(week+" 周 "+day+" 天");
      }
}