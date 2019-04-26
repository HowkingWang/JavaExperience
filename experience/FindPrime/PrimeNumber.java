import java.util.*;
public class PrimeNumber{
   public static void main(String [] args){
     int count = 0;
   Scanner reader = new Scanner(System.in);
     System.out.println("Input n&m,Please");
    int x = reader.nextInt();
    int y = reader.nextInt();
      int m = x<y?x:y;
      int n = x>y?x:y;
     
    for(int i=m;i<=n;i++){
             int k = i/2+1;
           boolean flag = true;
            for(int j=2;j<k;j++){
               if(i%j==0){
                     flag = false;
                   }
               }
          if(flag){
           System.out.println("prime Number:"+i);
           count++;
           System.out.println("The number of primeNumber:"+count);
          }
       }
     }
}
    
     
    
   