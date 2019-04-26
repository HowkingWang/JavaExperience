import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Listen implements ItemListener{
      JComboBox comboBox;
      Police police;
      public void setComboBox(JComboBox c){
               comboBox = c;
          }
      public void setP(olice police){
                 this.police = police;
           }
       public void itemStateChange(ItemEvent e){ 
          String name = comboBox.getSource().toString();
   }
}    