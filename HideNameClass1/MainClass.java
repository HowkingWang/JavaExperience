public class MainClass{
  public static void main(String [] args){
    HelloStyle style = new HelloStyle();
     style.speak(new SayHello()//û������ֻ�����弴������
            {public void sayHello(){
            System.out.print("Hello!Have you had lunch!�������й��ʺ�ϰ�ߣ�");
    }
   }
  );
    style.say(new SpeakHello(){
     public void speakHello(){
      System.out.print("Welcome TO NewYork!");
  }
 }
 ); 
 }
}