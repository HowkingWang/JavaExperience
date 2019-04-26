public class Lader{
     double above,bottom,height;
     public void setAbove(double a){
             above = a;
       }
    public void setBottom(double b){
               bottom = b;
       }
    public void setHeight(double h){
              height = h;
       }
    public double getArea(){
          return ((above+bottom)*height)/2;
    }
}