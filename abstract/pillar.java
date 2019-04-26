public class pillar{
 double height;
 geometry bottom;
 pillar(geometry bottom,double height){
 this.bottom = bottom;
 this.height = height;
  }
 double getVolume(){
  double volume = height*bottom.getArea();
  return volume;
 }
}
