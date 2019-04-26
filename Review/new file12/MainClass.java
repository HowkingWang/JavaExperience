public class MainClass{
   public static void main(String [] args){
    WindowActionEvent win = new WindowActionEvent();
     Listener police = new Listener();
     win.setDIYListener(police);
     win.setBounds(233,200,600,500);
     win.setTitle("Calclator");   
  }
}