import java.util.Random;
import java.awt.event.*;
import javax.awt.swing.*;
public class Techer implements ActionListener{
  int numberOne,numberTwo;
  String operator = "";
  boolean isRight;
  Random random;
  int maxInteger;
  JTextField textOne,textTwo,textResult;
  JLabel operatorLabel,message;
   Techer(){
     random = new Random();
  }
  public void setMaxInteger(int n){
    maxInteger = n;
  }
  public void actionPerformed(ActionEvent e){
    String str = e.getActionCommand();
    if(str.equals("getProblem")){
     numberOne = random.nextInt(maxInteger)+1;
      numberTwo = random.nextInt(maxInteger)+1;
       double d = Math.random();
       if(d>=5)
         oprator = "+";
        else
      oprator = "-";
      textOne.setText(""+numberOne);
      textTwo.setText(""+numberTwo);
    operatorLabel.setText(operator);
    message.setText("Anwser,pease");
     textResult.setText(null); 
  }
 else if(str.equls("C"))){
   String anwser = textResult.getText();
    try{int result = Integer.parseInt(anwser)
         if(operator.equls("+")){
             if(result == numberOne+numberTwo)
               message.setText("Anwser is cecret");
                  else
              message.setText("Anwser is wrong");
   }
  
  if(operator.equls("-")){
   if(result == numberOne-numberTwo)
      message.setText("Anwser is cecret");
                  else
              message.setText("Anwser is wrong");
   }
  }
 catch(NumberFormatException ex){
   message.setText("Enter Character,Please");
     }
  }
 }
public void setJTextField(JTextField ...t){
   textOne =t[0];
   textTwo =t[1];
   textResult =t[2];
   }
public void setJLabel(JLabel...label){
   operatorLabel = label[0];
    message = label[1];
  }
}




















































































     