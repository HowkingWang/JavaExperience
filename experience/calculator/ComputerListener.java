import java.awt.event.*;
import javax.swing.*;
public class ComputerListener implements ActionListener{
   JTextField inputText1,inputText2;
   JTextArea areaShow;
   String symbol;
     public void setJTextFieldOne(JTextField t){
     inputText1 = t;
   }
   public void setJTextFieldTwo(JTextField t){
     inputText2 = t;
   }
   public void setJTextArea(JTextArea area){
        areaShow = area;
   }
   public void setSymbol(String s){
      symbol = s;
   }
   public void actionPerformed(ActionEvent e){
    try{
        double number1 = Double.parseDouble(inputText1.getText());
     double number2 = Double.parseDouble(inputText2.getText());
    double result = 0;
    if(symbol.equals("+")){
      result = number1+number2;
     }  
    else if(symbol.equals("-")){
       result = number1-number2;
     }
    else if(symbol.equals("*")){
       result = number1*number2;
     }
    else if(symbol.equals("/")&&number2!=0){
       result = number1/number2;
    }
    areaShow.append(number1+""+symbol+""+number2+"="+result+"\n");
  }
  catch(Exception exp){
    areaShow.append("\n Please input char \n");
    }
   }
}

 