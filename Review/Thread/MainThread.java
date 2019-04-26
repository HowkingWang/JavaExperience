public class MainThread{
  public static void main(String [] args){
            SpeakDog speakDog = new SpeakDog();
             speakDog.start();
             SpeakCat speakCat = new SpeakCat();
             speakCat.start();
    for(int i=0;i<90;i++){
              System.out.println("This MainThread");
       }
    }
}