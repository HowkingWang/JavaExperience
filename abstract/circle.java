public class circle extends geometry{
  double r;
  circle(double r){
  this.r = r;
 }
  public double getArea(){
   return 3.14159*r*r;

  }
}