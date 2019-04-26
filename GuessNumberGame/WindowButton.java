import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowButton extends JFrame implements ActionListener{
  int number;
  JButton buttonEnter,buttonGuessNumber;
  JTextField inputGuess;
  JLabel hintLabel;
  WindowButton(String s){
    /* super(s);
    addWindowListener(new WindowAdapter(){
     public void windowClosing(WindowEvent e){
      dispose();
     }
    }
  ); */

   setLayout(new FlowLayout());
   setVisible(true);
   buttonEnter = new JButton("Sure");
   buttonGuessNumber = new JButton("Gain a Random Number");
   hintLabel = new JLabel("Input Guess what you do",JLabel.CENTER);
   hintLabel.setBackground(Color.cyan);
   inputGuess = new JTextField("0",10);
   buttonEnter.addActionListener(this);
   buttonGuessNumber.addActionListener(this);
   add(buttonEnter);
   add(hintLabel);
   add(inputGuess);
   add(buttonGuessNumber);
   setBounds(100,100,600,500);
   setSize(400,500);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   validate();
   }

   public void actionPerformed(ActionEvent e){
     if(e.getSource()==buttonGuessNumber){
     number = (int)(Math.random()*100)+1;
     hintLabel.setText("Input number that you guess:");
     }
 else if(e.getSource()==buttonEnter){
   int guess = 0;
   try{ guess = Integer.parseInt(inputGuess.getText());
         if(guess==number){
     hintLabel.setText("You Are Right!");
    }
    else if(guess>number){
     hintLabel.setText("Surpass");
      inputGuess.setText(null);
   }
   else if(guess<number){
      hintLabel.setText("Smaller");
      inputGuess.setText(null);
   }
  }
 catch(NumberFormatException event){
   hintLabel.setText("Input Char,Please!");
      }
     }
   }
}
        