import java.util.*;
public class Cai{
 public static void main(String [] args){
  int number=(int)(Math.random()*100)+1; 
  System.out.println("请输入一个100以内的数：");
  Scanner reader = new Scanner(System.in);
  int i = reader.nextInt();
  if(i==number){
  System.out.println("恭喜！你猜对啦");
    }
 else
 System.out.println("很遗憾！猜错了@@");
  }
}
 