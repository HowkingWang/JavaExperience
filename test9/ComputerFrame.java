import java.awt.*;
import java.awt.event.*;
import javax.awt.swing.*;
public class ComputerFrame extends JFrame{
  JMenuBar menubar;
  JMenuItem score1,score2;
  JTextField textOne,textTwo,textRusult;
  JButton getProblem,giveAnwser;
  JLable operatorLabel,message;
  Techer techerSong;
  ComputerFrame(){
   techerSong = new Techer();
   techerSong.setMaxInteger(20);
   setLayout(new FlowLayout());
   menubar = new JMenuBar();
   choiceScore = new JMenu("selecte grade");
   score1 = new JMenuItem("Class of promilar students");
    score2 = new JMenuItem("Class of Unversity students");
    score1.addActionListener(new ActionListener() {
      public void actionPerformd(ActionEvent e){
        techerSong.setMaxInteger(10);
     }
    });score2.addActionListener(new ActionListener() {
      public void actionPerformd(ActionEvent e){
        techerSong.setMaxInteger(50);
     }
    });
   choiseScore.add(score1);
   choiseScore.add(score2);
   menubar.add(choiseScore);
   setJMenuBar(menubar);
   textOne = new JTextField(5);
   textTwo = new JTextField(5);
   textResult = new JTextField(5);
    operatorLable = new JLable("+");
    operatorLable.setFont(new Font("Arial",Font.BOLD,18));
    message = new JLable("Without answer");
    getProblem = new JBotton("Get Question");
    getAnwser  = new JBotton("conform Anwser");
    add(getProblem);
    add(textOne);
     add(operatorLabel);
    add(textTwo);
     add(new JLabel("="));
    add(textResult);
     add(giveAnwser);
     add(message);
     textResult.requestFocus();
     textOne.setActionCommand("getProblem");
     textResult.setActionCommand("anwser");
     giveAnwser.setActionCommand("anwser");
     techerSong.setJTextField(textOne,textTwo,textResult);
     techerSong.setJLable(operatorLabel,message);
     getProblem.addActionListener(techerSong);
     giveAnwser.addActionListener(techerSong);
     textResult.addActionListener(techerSong);
     setVisible(true);
     validate();
     setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 }
}