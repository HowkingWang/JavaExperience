import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class WindowMessage extends JFrame implements ActionListener{
    JTextField inputEnglish;
    JTextArea show;
    String regex = "[a-zZ-Z]+";
   WindowMessage(){
     inputEnglish = new JTextField(22);
     inputEnglish.addActionListener(this);
     show = new JTextArea(20,25);
     add(inputEnglish,BorderLayout.NORTH);
     add(show,BorderLayout.CENTER);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==inputEnglish){
           String str = inputEnglish.getText();
           if(str.matches(regex)){
                show.append(str+" ");
          }
       else{
           JOptionPane.showMessageDialog(this,"The String is Unlawful!","dialog of message",JOptionPane.WARNING_MESSAGE);
            inputEnglish.setText(null);
          } 
       }
    }
}
     