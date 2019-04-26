import java.util.*;
public class PrimeNumber{
  public static void main(String [] args){
         int count = 0;
    System.out.println("请输入两个数m&n");
       Scanner reader = new Scanner(System.in);
          int a = reader.nextInt();
          int b = reader.nextInt();
          int m = a<b?a:b;
          int n = a>b?a:b;           
          for(int i=m;i<n;i++){            
              int k = i/2+1;
              boolean flag = true;  
              for(int j=2;j<k;j++){
                 if(i%j==0){
                      flag = false;
             }
         }
       
              if(flag){  
    System.out.println(i+"是质数");
         count++;
           System.out.println("The number of primeNumber:"+count);
          }
           else{
    System.out.println(i+"不是质数");
       }
     }
   }
}              