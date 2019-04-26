import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyListener implements DIYCommandListener{
   JTextField inputText;
   JTextArea areaShow; 
   public void setJTextField(JTextField text){
      inputText = text;
     }
   public void setJTextArea(JTextArea area){
     areaShow = area;
    }
   public void actionPerformed(ActionEvent e){
     String str = inputText.getText();
     areaShow.append(str+"Length of String:"+str.length()+"\n");
  }
}
     