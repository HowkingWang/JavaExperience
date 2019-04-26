import javax.swing.*;
import java.awt.*;
public class WindowKey extends JFrame{
   JButton button;
   JTextField text[]=new JTextField[3];
   Police police;

   Win(){
     setLayout(new FlowLayout());
     police = new Police();
     for(int i=0;i<3;i++){
      text[i]= new JTextField(8);
      text[i].addKeyListener(police);
      text[i].addFocusListener(police);
      add(text[i]);
  }

  button = new JButton("Yes");
  add(button);
  text[0].requstFocusInWindow();
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}