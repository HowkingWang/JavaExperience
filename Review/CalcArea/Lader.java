import java.awt.*;
import javax.swing.*;
public class Lader{
     double above,bottom,height;
     JTextField text1,text2,text3;
     JTextArea areaShow;
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