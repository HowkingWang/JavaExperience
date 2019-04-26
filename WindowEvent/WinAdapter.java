import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class WinAdapter extends JFrame{
 Gilr police;
 WinAdapter(String s){
   super(s);
   police = new Gilr();
   setBounds(100,100,300,500);
   setVisible(true);
   addWindowListener(police);
   validate();
  }
}
class Gilr extends WindowAdapter{
   public void windowClosing(WindowEvent e){
      System.exit(0);
  }
}