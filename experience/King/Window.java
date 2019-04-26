import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame{
   JButton button;
   JTextArea areaShow;
   JTextField text1,text2;
   JComboBox comboBox;
   Police police;
   Listener lis;
   
   public Window(){
     init();
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     validate();
    }
   
   public void init(){
         police = new Police();
         police.setJText1(text1);
         police.setJText2(text2);
         police.setJTextArea(areaShow);
         police.setName(n);
          lis = new Listen();
           lis.setComboBox(c);
           lis.setP(police);
         JPanel pNorth = new JPanel();
         pNorth.add(new JLabel("nuber1"));
         JTextFiled text1 = new JTextFiled();
         pNorth.add(text1);
        pNorth.add(new JLabel("nuber2"));
         JTextFiled text2 = new JTextFiled();
         pNorth.add(text2);
         button = new JButton("Calc");
          pNorth.add(button);
         add(pNorth,BorderLayout.NORTH);
        button.addActionListener(police);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("+");
        comboBox.addItem("-");
        comboBox.addItem("*");
        comboBox.addItem("/");
        pNorth.add(comboBox);
          comboBox.addItemListener(lis);
        areaShow = new JTextArea(10,16); 
       add(new JScrollPane(areaShow),BorderLayout.CENTER);
    }
 }
      
              
              
       
        