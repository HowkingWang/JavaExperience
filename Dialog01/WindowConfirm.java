import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class WindowConfirm extends JFrame implements ActionListener{
   JTextField inputText;
   JTextArea save;
   
    JButton button;

    WindowConfirm(){
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      save = new JTextArea(20,25);
      inputText = new JTextField(10);
      inputText.addActionListener(this);
      add(inputText,BorderLayout.NORTH);
      add(new JScrollPane(save),BorderLayout.CENTER);

       button = new JButton("Open DialogColor");
       add(button,BorderLayout.EAST);
       button.addActionListener(this);

        }
     public void actionPerformed(ActionEvent e){
        Color newColor = JColorChooser.showDialog(this,"MixColorPane",getContentPane().getBackground());
       if(newColor!=null){
           getContentPane().setBackground(newColor);
    }

     String str = inputText.getText();
         int n = JOptionPane.showConfirmDialog(this,"Sure?","Dialog of Confirm",JOptionPane.YES_NO_OPTION);
         if(n==JOptionPane.YES_OPTION){
                 save.append(str+"\n");
        }
         else if(n==JOptionPane.NO_OPTION){
                   inputText.setText(null);
          }
      }
   
}
                      