package jisuanarea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class triangleArea extends JFrame implements ActionListener{
    JTextField text1,text2,text3;
    JTextArea areaShow;
    JButton button;
    Triangle triangle;
    
    public triangleArea(){
         init();
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          validate();
           }

        public void init(){
        triangle = new Triangle();
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel("side A"));
        text1 = new JTextField(6);
        pNorth.add(text1);
        pNorth.add(new JLabel("side B"));
        text2 = new JTextField(6);
        pNorth.add(text2);
        pNorth.add(new JLabel("side C"));
        text3 = new JTextField(6);
        pNorth.add(text3);   
        button = new JButton("Calc");
        pNorth.add(button);
        add(pNorth,BorderLayout.NORTH);
        button.addActionListener(this);
        areaShow = new JTextArea(10,16); 
       add(new JScrollPane(areaShow),BorderLayout.CENTER);
        }

        public void actionPerformed(ActionEvent e){
                 
               try{
                   double sideA = Double.parseDouble(text1.getText());
                   double sideB = Double.parseDouble(text2.getText());
                   double sideC = Double.parseDouble(text3.getText());
                   triangle.setSideA(sideA);
                   triangle.setSideB(sideB);
                   triangle.setSideC(sideC);
                   areaShow.append("The area of            Triangle:"+triangle.getArea()+"\n");
   		}
    catch(Exception ex){
          areaShow.append("\n"+ex+"\n");
          }
    }
}


class Triangle{
        double sideA,sideB,sideC,area;
        boolean flag;                     
          public void setSideA(double a){
                    sideA = a;
        if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA)
               flag = true;
         else 
               flag = false;               
               }

          public void setSideB(double b){
                    sideB = b;
        if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA)
               flag = true;
         else 
               flag = false;
               }

          public void setSideC(double c){
                    sideC = c;
        if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA)
               flag = true;
         else 
               flag = false;
               }
                     
          public String getArea(){
                 if(flag){
                   double p = (sideA+sideB+sideC)/2.0;
           area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
                return String.valueOf(area);
                }             
             else{
         return "Cannot calclate";
     }
   }
}


