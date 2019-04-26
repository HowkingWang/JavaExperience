public class Calculater{
  public float calclate(int a,int b){
        return a+b;
   }
  public double calclate(long a,long b){
        return a-b;
   }
  public double calclate(float a,float b){
        return a*b;
   }
   public double calclate(double a,double b){
        return a/b;
   }
    public double calclate(float a,double b){
        return a%b;
   }
    public double calclate(int a,long b){
        return Math.sqrt(a*b);
   }
 }