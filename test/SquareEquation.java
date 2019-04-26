package tom.jiafei;
public class SquareEquation{
 double a,b,c;
  double root1,root2;
  boolean boo;
  public SquareEquation(double a,double b,double c){
   this.a = a;
   this.b = b;
   this.c = c;
   if(a!=0){
   boo = ture;
  }
  else
  boo = false;
 }
 public void getRoots(){
  if(boo){
   System.out.println("是二次方程");
    double disk=b*b-4*a*c;
    if(disk>0){
    root1=(-b-Math.sqrt(disk))/(2*a);
    root2=(-b+Math.sqrt(disk))/(2*a);
     System.out.printf("root of SquareEquation:%f,%f\n",root1\n);
      }
    else{
      System.out.printin("The SqureEquation haven't root");
  }
  else{
   System.out.printin("The Equation isn't SquareEquation");
   }
 }
  public void setCoefficient(double a,double b,double c){
       this.a = a;
   this.b = b;
   this.c = c;
   if(a!=0){
   boo = ture;
  }
  else
  boo = false;
 }
}