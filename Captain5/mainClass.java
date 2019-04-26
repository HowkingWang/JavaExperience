class A{
 double x,y;
  void sum(){
   double sum;
      sum = x+y;
   System.out.println("Sum="+sum);
  }
}
 class B extends A{
   }
public class mainClass{
  public static void main(String args[]){
   B b = new B();
   b.x = 123.0;
   b.y=125.0;
   b.sum();
  }
}