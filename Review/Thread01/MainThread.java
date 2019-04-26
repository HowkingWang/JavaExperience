public class MainThread{
  public static void main(String [] args){
            SpeakDog dog = new SpeakDog();
            SpeakCat cat = new SpeakCat();
              Thread speakCat = new Thread(cat);
              Thread speakDog = new Thread(dog);
             speakDog.start();
             speakCat.start();
    for(int i=0;i<90;i++){
              System.out.println("This MainThread");
       }
    }
}