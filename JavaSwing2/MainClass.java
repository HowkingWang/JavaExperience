public class MainClass{
  public static void main(String [] args){
   ComponentInWindow win1 = new ComponentInWindow();
   win1.setBounds(120,100,700,600);
   win1.setTitle("Nomal ComponentInWindow");
   WindowMenu win2 = new WindowMenu("A Window with menu",50,60,700,800);
  }
}