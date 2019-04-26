import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Police implements ActionListener{
    JTextArea areaShow;
   JTextField text1,text2;
   String name;
    public void setText1( JTextField text1){ 
           this.text1 = text1;
        } 
    public void setText2( JTextField text2){ 
           this.text2 = text2;
        } 
    public void setTextArea(JTextArea areaShow){ 
           this.areaShow = areaShow;
        } 
    public void setName(String n){
                   name = n;
        }
    public void actionPerformed(ActionEvent e){
              double result = 0;
          try{
               double number1 = Double.parseDouble(text1.getText()); 
               double number2 = Double.parseDouble(text2.getText());
                 if(name.equals("+")){
                     result = number1+number2;
                   }                  if(name.equls("+")){
                     result = number1+number2;
                   } 
                 else if(name.equals("-")){
                     result = number1-number2;
                   } 
                 else if(name.equals("*")){
                     result = number1*number2;
                   } 
                 else if(name.equals("/")){
                     result = number1/number2;
                   } 
          areaShow.append("The reslut:"+result+"\n");
             }
       catch(Exception ex){
           areaShow.append("error"+ex+"\n");
                 }
         }
}