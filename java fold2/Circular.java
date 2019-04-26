public class Circular{
   double height;
   Circle bottom;
   Circular(Circle c,double h){
         height = h;
         bottom = c;
   }
 double getVolem(){
    return bottom.getArea()*height/3.0;
  }
 double getBottomRadius(){
  return bottom.getRadius();
  }
 public void setBottomRadius(double r){
       bottom.setRadius(r);
   }
}
