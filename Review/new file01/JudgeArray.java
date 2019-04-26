import java.util.*;
public class JudgeArray{
   public static void main(String [] args){
   int a[] = {1,2 ,3,6,67,78,98,100};
   Scanner reader = new Scanner(System.in);
     System.out.println("Input a number,Please");
    int x = reader.nextInt();
       
         boolean flag = false;
    for(int i=0;i<a.length;i++){
           if(x==a[i]){
            flag = true;
         }
       }

         if(flag){
       System.out.println("x在数组中");
     }
           else
        System.out.println("x不在数组中");
  
 }
}
