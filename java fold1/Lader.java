public class Lader{
  double height,bottom,above,area;
  Lader(double a,double b,double h){
    bottom = b;
    above = a;
    height = h;
  } 
  double getArea(){
    area = (bottom+above)*height/2;
    return area;
  }
}