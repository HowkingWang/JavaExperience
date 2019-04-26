import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window extends JFrame implements ActionListener{
    JButton button;
    JTextField text1,text2,text3;
    JTextArea areaShow;
    Lader lader;
            
    public Window(String s){
      init();
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      validate();
    }
    void init(){    //初始化&&布局   
       button = new JButton("Calc");
       text1 = new JTextField(6);
       text2 = new JTextField(6);
       text3 = new JTextField(6);
       areaShow = new JTextArea(10,12);
          lader = new Lader();
       JPanel pNorth = new JPanel();
        pNorth.add(new Label("Above"));
        pNorth.add(text1);
        pNorth.add(new Label("Bottom"));       
        pNorth.add(text2); 
        pNorth.add(new Label("Height"));       
        pNorth.add(text3);
        pNorth.add(button);
        button.addActionListener(this);
        add(pNorth,BorderLayout.NORTH);
        add(new JScrollPane(areaShow),BorderLayout.CENTER);     
    }
    public void actionPerformed(ActionEvent e){
         try{
            double above = Double.parseDouble(text1.getText());
            double bottom = Double.parseDouble(text2.getText());
            double height = Double.parseDouble(text3.getText());       
             lader.setAbove(above);
             lader.setBottom(bottom);
             lader.setHeight(height);                   
             double area = lader.getArea();             
             areaShow.append("The area of Lader:"+area+"\n");
       }
      catch(Exception ex){
        areaShow.append("Exception"+"\n");
           }
    }
}
