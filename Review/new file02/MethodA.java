public class MethodA implements Average{
  public double calcAverage(double a,double b){
      double average = (a+b)/2;
     System.out.println("Average in MethodA:"+average);
     return average;
  }
}