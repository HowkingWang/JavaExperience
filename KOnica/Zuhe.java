class Point{
  float x,y;
  void setXY(float a,float b){
     x = a;
     y = b;
  }
}
class Xiyouji{
   float height,weight;
   String head,ear;
   void speak(String s){
     System.out.println(s);
  
   }
 }
public class Zuhe{
  public static void main(String args[]){
     Point S1,S2;
     S1 = new Point();
     S2 = new Point();     
   S1.setXY(110.0f,113.0f);
   S2.setXY(12.0f,17.12f);
   System.out.println(" Address of S1:"+S1);
   System.out.println("Address of S2:"+S2);
    System.out.println(S1.x);
    System.out.println(S1.y);
    System.out.println(S2.x);
     System.out.println(S2.y);
   
     S2 = S1;
     System.out.println("��S1��ֵ��S2��");
    System.out.println(" Address of S1:"+S1);
   System.out.println("Address of S2"+S2);
    System.out.println(S1.x);
    System.out.println(S1.y);
    System.out.println(S2.x);
     System.out.println(S2.y); 
   
     Xiyouji zhubajie;
   zhubajie = new Xiyouji();
   zhubajie.speak("ʦ�������ǻظ���ׯ��.�����ڼҵ����ǳԷ���");
   zhubajie.height = 1.8f;
   zhubajie.ear = "һ˫�����";
   zhubajie.weight = 1000.0f;
   zhubajie.head = "ԲԲ��";
   System.out.println(zhubajie.weight);
   System.out.println(zhubajie.height);
   System.out.println(zhubajie.ear);
   System.out.println(zhubajie.head);
  } 
   }