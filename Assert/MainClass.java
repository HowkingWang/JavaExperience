import java.util.Scanner;
public class MainClass{
   public static void main(String [] args){
    int [] score = {-87,100,123,145,125,135,150};
     int sum = 0;
    for(int number:score){
     assert number>=0:"负数不能为成绩";
     sum = sum+number;
   }
   System.out.println("Sum Score:"+sum);
  }
}