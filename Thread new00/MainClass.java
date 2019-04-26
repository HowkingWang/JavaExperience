public class MainClass{
   public static void main(String [] args){
     Time schadule = new Time();
     Thread showTime = new Thread(schadule);
      showTime.start();
  }
}