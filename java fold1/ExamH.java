public class ExamH{
  public static void main(String args[]){
  Circle circle = new Circle();
  circle.setRadious(12.9);
  Lader lader = new Lader(12.1,32.4,56.78);
  Student liu = new Student();
  System.out.println("Result of CircleArea by liu:");
  double result = liu.computerArea(circle);
  System.out.println(result);
  System.out.println("Result of LaderArea by liu:");
  result = liu.computerArea(lader);
  System.out.println(result);
  }
}

 
  
