public class Circle extends Geometry{
   double r;
   Circle(double r){
     this.r = r;
   }
  public double getArea(){
     return 3.1415*r*r;
   }
}