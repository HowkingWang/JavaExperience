public class SpeakCat extends Thread{
  public void run(){
        for(int i=0;i<80;i++){
           System.out.println("Cat"+i+"     ");
    }
  }
}