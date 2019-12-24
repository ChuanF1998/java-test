/* 任意输出五个数，判断里边有无重复的数 */

import java.util.Scanner;
public class Test07
{
     public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           int a[]=new int[5];
           for(int i=0;i<5;i++){
                a[i]=input.nextInt();
           }
           for(int i=0;i<5;i++){
                for(int j=i+1;j<5;j++){
                      if(a[i]==a[j]){
                         System.out.println("相等的数为 "+a[i]);
                      }
                }
           }
     }
}