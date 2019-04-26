public class ExamD{
  public static void main(String args[]){
   Circle circle = new Circle(12);
   System.out.println("address of Circle:"+circle);
   System.out.println("Circle Radius:"+circle.getRadius()); 
   Circular circular = new Circular(circle,29);
   System.out.println("Address of Circuar:"+circular); 
   System.out.println("Circular Radius:"+circular.getBottomRadius());
   System.out.println("Circular Volem:"+circular.getVolem());
   //double r = 888;
   }
}