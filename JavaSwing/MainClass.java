import javax.swing.*;
import java.awt.*;
public class MainClass{
  public static void main(String args []){
   JFrame window1 = new JFrame("WindowA");
   JFrame window2 = new JFrame("WindowB");
   Container con = window1.getContentPane();
   con.setBackground(Color.blue);
   con = window2.getContentPane();
   con.setBackground(Color.yellow);
   window1.setBounds(100,100,188,108);
   window2.setBounds(270,100,208,118);
   window1.setVisible(true);
   window1.setSize(567,789);
   window1.setResizable(true);
   window1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
   window2.setVisible(true);
   window2.setSize(500,600);
   window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
}         