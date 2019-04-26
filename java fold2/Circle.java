public class Circle{
   double area,radius;
   Circle(double r){
     radius = r;
 }
  void setRadius(double r){
    radius = r;
 }
  double getRadius(){
     return radius;
 }
  double getArea(){
    area = 3.14159*radius*radius;
    return area;
 }
}