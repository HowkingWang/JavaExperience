import java.util.*;
public class MainClass{
   public static void main(String [] args){
   Scanner reader = new Scanner(System.in);
     System.out.println("Input n&m,Please");
    int m = reader.nextInt();
    int n = reader.nextInt();
     for(int i=m;i<=n;i++){
           int k = i/2+1;
            boolean flag = true;
             for(int j=2;j<=k;j++){
              if(i%j==0){
                    flag = false;
              }
             }
          if(flag){
                System.out.println("Prime Number:"+i);
          }
        }
    }     
}