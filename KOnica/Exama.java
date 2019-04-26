class Point{
  float x,y;
  void setXY(float a,float b){
     x = a;
     y = b;
  }
}
public class Exama{
  public static void main(String args[]){
     Point S1,S2;
     S1 = new Point();
     S2 = new Point();     
   S1.setXY(110.0f,113.0f);
   S2.setXY(12.0f,17.12f);
   System.out.println(" Address of S1:"+S1);
   System.out.println("Address of S2:"+S2);
    System.out.println(S1.x);
    System.out.println(S1.y);
    System.out.println(S2.x);
     System.out.println(S2.y);
   
     S2 = S1;
     System.out.println("将S1赋值给S2后：");
    System.out.println(" Address of S1:"+S1);
   System.out.println("Address of S2"+S2);
    System.out.println(S1.x);
    System.out.println(S1.y);
    System.out.println(S2.x);
     System.out.println(S2.y); 
   }
}   
   