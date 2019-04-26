public class MainClass{
  public static void main(String [] args){
    HelloStyle style = new HelloStyle();
     style.speak(new SayHello()//没有类名只有类体即匿名类
            {public void sayHello(){
            System.out.print("Hello!Have you had lunch!（这是中国问候习惯）");
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