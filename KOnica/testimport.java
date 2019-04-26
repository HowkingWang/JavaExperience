
import java.util.*;
public class testimport{
   public static void main(String args[]){
     System.out.println("please input some number and symbol of end in 0 :");
     Scanner reader = new Scanner(System.in);
    float sum = 0;
    float x = reader.nextFloat();
     while(x!=0){
         sum = sum+x;
     x = reader.nextFloat();
    }
  System.out.println(sum);     
  }
}
