public class Triangle{
  double a,b,c,area;
  boolean isTriangle;
  public String getArea(){
    if(isTriangle){
      double p = (a+b+c)/2;
      area = Math.sqrt(p*(p-a)*(p-c)*(p-b));
       return String.valueOf(area);
   }
 else{
   return "cannot calculator!";
  }
 }
  public void setA(double a1){
   a = a1;
   if(a+b>c&&a+c>b&&c+b>a)
     isTriangle = true;
    else
     isTriangle = false;
   }
   public void setB(double b1){
   b = b1;
   if(a+b>c&&a+c>b&&c+b>a)
     isTriangle = true;
    else
     isTriangle = false;
   }
    public void setC(double c1){
   c = c1;
   if(a+b>c&&a+c>b&&c+b>a)
     isTriangle = true;
    else
     isTriangle = false;
   }
}