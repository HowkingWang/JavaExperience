import java.util.*;
public class B {
  public static void main(String args[]){
   System.out.println("input serval number and press ender :");
   System.out.println("in '0' symbol end");
    Scanner reader=new Scanner(System.in);
     double sum = 0;
     double x = reader.nextDouble();
     while(x!=0){
        sum = sum+x;
         x= reader.nextDouble();
}
   System.out.println("sum="+sum);
   }
  }