class X{
  int r;
  X(int r){
     this.r = r;
 }     
  public void setX(int r){
     r = r;
 }
  int getR(){
    return r;
  }
}
public class ExamP{
 public static void main(String args[]){
  X a = new X(100);
  System.out.println(""+a.getR());
 }
}