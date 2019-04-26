import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowsActionEvent extends JFrame{
  JTextField inputText;
  JTextArea areaShow;
  JButton button;
  DIYCommandListener listener;
  public WindowsActionEvent(){
     setLayout(new FlowLayout());
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     init();
    }
     void init(){
     add(new Label("Feedback of The Game"));
     inputText = new JTextField(15);
     add(inputText);
     areaShow = new JTextArea(12,34);
     add(new JScrollPane(areaShow));
     add(areaShow);
     button = new JButton("submit");
     add(button);
  }
   void setDIYCommandListener(DIYCommandListener listener){
    this.listener = listener;
    listener.setJTextField(inputText);
    listener.setJTextArea(areaShow);
    inputText.addActionListener(listener);
    button.addActionListener(listener);
    }
}