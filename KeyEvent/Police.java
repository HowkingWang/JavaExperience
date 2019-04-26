import java.awt.*;
import javax.swing.*;
public class Police implements FocusListener,KeyListener{
  public void keyPressed(KeyEvent e){
     JTextField t = (JTextField)e.getSource();
     if(t.getCaretPosition()>7)
       t.transferFocus();
   }

  public void keyTyped(KeyEvent){}
  public void keyReleased(KeyEvent){}
  public void keyGained(KeyEvent){}
    JTextField text = (JTextField)e.getSource();
     text.setText(null);
    }

   public void focusLost(FocusEvent e){}
 }