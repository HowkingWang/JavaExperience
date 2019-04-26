import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class OperatorListener implements ItemListener{
  JComboBox choice;
  ComputerListener workTogether;
  public void setJComboBox(JComboBox box){
      choice = box;
  }
  public void setWorkTogether(ComputerListener computer){
      workTogether = computer;
   }
  public void itemStateChanged(ItemEvent e){
    String symbol = choice.getSource().toString();
       workTogether.setSymbol(symbol);
   }
}
       