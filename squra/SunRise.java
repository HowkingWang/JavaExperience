import java.util.Scanner;
public class SunRise{
  public static void main(String [] args){
   SquraEquation r = new SquraEquation();
   System.out.println("��������Ҫ���������");
   Scanner reader = new Scanner(System.in);
   double t = reader.nextDouble();
    double result = r.Squra(t);
    System.out.println("Result="+result);
  }
}