class X{
  int x=123;
  public void setX(int x){
     this.x = x;//���������x��ֵ����Ա����x
 }
  int getX(){
    return x;
  }
}
public class ExamO{
 public static void main(String args[]){
  X a = new X();
  a.setX(-100);
  System.out.println(""+a.getX());
 }
}