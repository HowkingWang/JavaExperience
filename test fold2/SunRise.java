 class SquraEquation {
 public double Calculation(double num){
  return Math.sqrt(num);
 }
}

public class SunRise{
 public static void main(String[] args) {
  SquraEquation se = new SquraEquation();
  double root = se.Calculation(10);
  System.out.println(root);
 }
}
