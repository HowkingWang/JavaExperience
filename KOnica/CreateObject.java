public class CreateObject{
   int x,y;
   CreateObject(float a,float b){
     x=(int)a;
     y=(int)b;
 }
 public static void main(String args[]){
    CreateObject M1,M2;
    M1=new CreateObject(12.0f,13.0f);
    M2=new CreateObject(10.0f,15.0f);
    System.out.println(M1);
  }
}