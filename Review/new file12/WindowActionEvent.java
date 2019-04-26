import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowActionEvent extends JFrame{
  JTextField text;
  DIYListener listener;
  JTextArea showArea;
  JButton button;

     public WindowActionEvent(){
          init();
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           validate();
    }
               void init(){ 
               setLayout(new FlowLayout());
               add(new JLabel("Field of Text"));
                text = new JTextField(13);
                add(text);
                button = new JButton("Sure");
                add(button);
                showArea = new JTextArea(8,13);
                add(new JScrollPane(showArea));
                
       }
   void setDIYListener(DIYListener listener){
             this.listener = listener;
             listener.setText(text);
             listener.setArea(showArea);
             text.addActionListener(listener);//register Monitor
             button.addActionListener(listener);
    }
}