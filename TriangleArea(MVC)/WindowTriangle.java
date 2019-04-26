import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowTriangle extends JFrame implements ActionListener{
  Triangle triangle;    //Model
  JTextField textA,textB,textC;   //View
  JTextArea  showArea;            //View
  JButton button;       //Controller

  WindowTriangle(){
    init();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void init(){
    button = new JButton("Calclator");
    triangle = new Triangle();
    button.addActionListener(this);
    textA = new JTextField(8);
    textB = new JTextField(8);
    textC = new JTextField(8);
    JPanel pNorth = new JPanel();
    pNorth.add(textA);
    pNorth.add(new JLabel("sideA"));
    pNorth.add(textB);
    pNorth.add(new JLabel("sideB"));
    pNorth.add(textC);
    pNorth.add(new JLabel("sideC"));
    pNorth.add(button);
    add(pNorth,BorderLayout.NORTH);
    add(new JScrollPane(showArea),BorderLayout.CENTER);
   }
    
  public void actionPerformed(ActionEvent e){
   try{
        double a1 = Double.parseDouble(textA.getText().trim());
        double b1 = Double.parseDouble(textB.getText().trim());
         double c1 = Double.parseDouble(textC.getText().trim());
    triangle.setA(a1);
     triangle.setA(b1);
     triangle.setA(c1);
    String area = triangle.getArea();
    showArea.append("Triangle"+a1+","+b1+","+c1+"Area:");
    showArea.append(area+"\n"); 
    }
  catch(Exception ex){
    showArea.append("\n"+ex+"\n");
    }
   }
}
    