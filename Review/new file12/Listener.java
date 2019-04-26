import java.awt.event.*;
import javax.swing.*;
public class Listener implements DIYListener{
     JTextField text;
     JTextArea showArea;  
  public void setText(JTextField text){
               this.text = text;
        }
  public void setArea(JTextArea showArea){
               this.showArea = showArea;
        }
 
    public void actionPerformed(ActionEvent e){
           String str = text.getText();
            showArea.append(str+":"+str.length()+"\n");
    }
}