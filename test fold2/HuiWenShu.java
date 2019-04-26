import java.util.*;
public class HuiWenShu{
 public static void main(String args[]){
 int a,b,c,d,y;
 System.out.println("Please enter a number among 1--9999:");
 Scanner reader = new Scanner(System.in); 
 int x = reader.nextInt();
  if(x<0||x>9999){
  System.out.println("Enter is Error!!");
   }
 a = (x/1000)%10;
 b = (x/100)%10;
 c = (x/10)%10;
 d = x%10; 
 y = a+b*10+c*100+d*1000;  
 if(x==y)  
    System.out.println("是回文数");						
  else 
   System.out.println("不是回文数");
 
  if(0<=x&&x<10){
    System.out.println("The number is one-digit:"+x);
   }
 else if(10<=x&&x<100){
     System.out.println("The number is double-digit:"+x);
   }
 else if(100<=x&&x<1000){
     System.out.println("The number is  three-digit:"+x);
  }
  else if(1000<=x&&x<10000){
     System.out.println("The number is four-digit:"+x);
  }
 }
}
   