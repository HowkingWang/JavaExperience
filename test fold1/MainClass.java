public class MainClass{
    public static void main(String args[]){
     A t1 = new A();
     t1.r(100);
    System.out.println("A="+t1.r(100));
     B t2 = new B();
     t2.b = 12.7f;
     System.out.println("B="+t2.b);
     C t3 = new C();
     t3.e(1243258);
     System.out.println("C="+t3.e(1243358));
 }
}