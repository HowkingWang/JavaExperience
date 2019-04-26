public class Circle implements Shape{
   double r;
   Circle(double r){
      this.r = r;
  }
   public double calcGirth(){ 
      return 6.18*r;
   }
   public double calcArea(){
     return 3.14*r*r;
   }
}
     