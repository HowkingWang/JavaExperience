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
   zhubajie.speak("师傅，咱们回高老庄吧.翠兰在家等我们吃饭呢");
   zhubajie.height = 1.8f;
   zhubajie.ear = "一双大耳朵";
   zhubajie.weight = 1000.0f;
   zhubajie.head = "圆圆的";
   System.out.println(zhubajie.weight);
   System.out.println(zhubajie.height);
   System.out.println(zhubajie.ear);
   System.out.println(zhubajie.head);
   
  }
 }