class Xiyouji{
   float height,weight;
   String head,ear;
   void speak(String s){
     System.out.println(s);
  
   }
 }
public class Exam{
 public static void main(String args[]){
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