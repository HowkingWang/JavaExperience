import javax.swing.*;
import java.awt.*;
import java.io.*;
public class WindowControl extends JFrame{
   JTextField inputText1,inputText2;
   JTextArea areaShow;
   JButton button;
   JComboBox comboBox;
   OperatorListener operator;
   ComputerListener computer;
   public WindowControl(){
     init();
     setVisible(true);
     setBackground(Color.BLUE);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
   void init(){
     setLayout(new FlowLayout());
     inputText1 = new JTextField(6);
     inputText2 = new JTextField(6);
     areaShow = new JTextArea(10,30);
     comboBox = new JComboBox();
     button = new JButton("calc");
     comboBox.addItem("choiceSymbol");
     String [] a = {"+","-","*","/"};
      for(int i=0;i<a.length;i++){
       comboBox.addItem(a[i]);
        } 
     operator = new OperatorListener();
     computer = new ComputerListener();
     operator.setJComboBox(comboBox);
     operator.setWorkTogether(computer);
     computer.setJTextFieldOne(inputText1);
     computer.setJTextFieldTwo(inputText2);
     computer.setJTextArea(areaShow);
     comboBox.addItemListener(operator);
     button.addActionListener(computer);
     add(inputText1);
     add(inputText2);
     add(new JScrollPane(areaShow));
     add(comboBox);
     add(button);
     
   }
}
     
