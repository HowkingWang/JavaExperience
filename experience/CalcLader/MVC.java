import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MVC extends JFrame implements ActionListener{
    JButton button;
    JTextField text1,text2,text3;
    JTextArea areaShow;
    Lader lader;
    
    
    
    public MVC(String s){
      init();
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      validate();
    }
    void init(){
       JPanel pNorth = new JPanel();
          lader = new Lader();   
       pNorth.add(new JLabel("Above"));
       text1 = new JTextField(6);
       pNorth.add(text1);
       pNorth.add(new JLabel("Bottom"));
       text2 = new JTextField(6);
       pNorth.add(text2);
       pNorth.add(new JLabel("Height"));
       text3 = new JTextField(6);
       pNorth.add(text3);
       button = new JButton("Calc");
        pNorth.add(button);
        button.addActionListener(this);
       add(pNorth,BorderLayout.NORTH);       
        button.addActionListener(this);                  
        areaShow = new JTextArea(15,20);
        add(new JScrollPane(areaShow),BorderLayout.CENTER);
                 
   }
     public void actionPerformed(ActionEvent e){
             double above = Double.parseDouble(text1.getText());
             double bottom = Double.parseDouble(text2.getText());
             double height = Double.parseDouble(text3.getText());
             
               lader.setAbove(above);
               lader.setBottom(bottom);
               lader.setHeight(height);
               double area = lader.getArea();
               areaShow.append("The area of Lader:"+area+"\n");
             
    }
  
}
       
        