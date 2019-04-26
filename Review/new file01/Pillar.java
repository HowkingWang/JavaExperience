public class Pillar{
   Geometry bottom;
   double h;
    Pillar(Geometry bottom,double h){
      this.bottom = bottom;   
      this.h = h;
  }
     public double getVolum(){
       return bottom.getArea()*h;
       
   }
}