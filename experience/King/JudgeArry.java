import java.util.*;
public class JudgeArry{
  public static void main(String [] args){
   int [] a={1,2,3,65,67,87,98,100};
   System.out.println("请输入一个数：");
    Scanner reader = new Scanner(System.in);
     int x = reader.nextInt();
    boolean flag = false;
    for(int i=0;i<a.length;i++){
      if(x==a[i])
          flag = true;
       }
   
     if(flag){
          System.out.println("x在数组中");
      }
     else{
         System.out.println("x不再数组中");
     }
  }
}
  
  