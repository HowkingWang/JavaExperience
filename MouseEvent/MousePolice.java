import java.awt.event.*;
import javax.swing.*;
public class MousePolice implments MouseListener{
  JTextArea area;
  public vooid setJTextArea(JTextArea area){
    this.area = area;
  }
  public void mousePressed(MouseEvent e){
    area.append("\n Mouse has been Pressed,Location:"+"("+e.getX()+","e.getY()+")");
   }
 public void mouseReleased(MouseEvent e){
    area.append("\n Mouse has been Released,Location:"+"("+e.getX()+","e.getY()+")");
   }
 public void mouseEtered(MouseEvent e){
   if(e.getSourse() instanceof JButton)
    area.append("\n Mouse has entered Button,Location:"+"("+e.getX()+","e.getY()+")");
   if(e.getSourse() instanceof JTextField)
    area.append("\n Mouse has entered text,Location:"+"("+e.getX()+","e.getY()+")");
   if(e.getSourse() instanceof JTextArea)
    area.append("\n Mouse has entered area,Location:"+"("+e.getX()+","e.getY()+")");
   }
 public void mouseExited(MouseEvent e){
    area.append("\n Mouse has exited,Location:"+"("+e.getX()+","e.getY()+")");
   }
   public void mouseClicked(MouseEvent e){
    if(e.getClickCount()>=2)
    area.setText("\n Mouse has been clicked for many times,Location:"+"("+e.getX()+","e.getY()+")");
   }
}