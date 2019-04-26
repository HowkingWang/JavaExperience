import java.awt.*;
import javax.swing.*;
public class WindowsLayout extends JFrame{
   Box box1,box2,baseBox;
   public WindowsLayout(){
   init();
   setLayout(new FlowLayout());
   setVisible(true);
   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
 void init(){
   box1 = Box.createVerticalBox();
   box1.add(new JLabel("Password"));
   box1.add(Box.createVerticalStrut(8));
   box1.add(new JLabel("email"));
   box1.add(Box.createVerticalStrut(8));
   box1.add(new JLabel("Perfession"));
   box2 = Box.createVerticalBox();
   box2.add(new JTextField(10));
   box2.add(Box.createVerticalStrut(8));
   box2.add(new JTextField(10));
   box2.add(Box.createVerticalStrut(8));
   box2.add(new JTextField(10));
   baseBox = Box.createVerticalBox();
   baseBox.add(box1);
   baseBox.add(Box.createVerticalStrut(10));
   baseBox.add(box2);
   add(baseBox);
  }
}














