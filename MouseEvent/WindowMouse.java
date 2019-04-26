import javax.swing.*;
import java.awt.*;
public class WindowMouse extends JFrame{
  JButton button;
  JTextArea areaText;
  JTextField text;
  MousePolice police;
  WindowMouse(){
   init();
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  public void init(){
   setLayout(new FlowLayout());
   button = new JButton("Button");
   areaText = new JTextArea(20,25);
   text = new JTextField();
   police = MousePolice();
   police.setJTextArea(areaText);
   text.addMouseListener(police)
   button.addMouseListener(police);
   add(text);
    add(new JScroll(areaText));
   add(button);
    addMoseListener(police);
   }
}