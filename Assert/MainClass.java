import java.util.Scanner;
public class MainClass{
   public static void main(String [] args){
    int [] score = {-87,100,123,145,125,135,150};
     int sum = 0;
    for(int number:score){
     assert number>=0:"��������Ϊ�ɼ�";
     sum = sum+number;
   }
   System.out.println("Sum Score:"+sum);
  }
}