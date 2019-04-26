public class MethodB implements Average{
  public double calcAverage(double a,double b){
      double average = Math.sqrt(a*b);
     System.out.println("Average in MethodB:"+average);
     return average;
  }
}