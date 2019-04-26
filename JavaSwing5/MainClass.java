public class MainClass{
  public static void main(String [] args){
   WindowsActionEvent win = new WindowsActionEvent();
   MyListener me = new MyListener();
   win.setDIYCommandListener(me);
   win.setTitle("EventListener");
   win.setSize(678,987);
   win.setBounds(123,200,456,657);
  }
}