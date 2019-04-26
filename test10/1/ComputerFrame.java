import java.awt.*;
import java.awt.event.*;   
public class ComputerFrame extends Frame implements ActionListener
 {
   TextField textOne, textTwo, textResult;
   Button getProblem, giveAnwser;
   Label operatorLabel, message;
   Teacher teacher;
   ComputerFrame(String s)
  {
   super(s);
   teacher = new Teacher();
   setLayout(new FlowLayout());
   textOne = new TextField(10);
   textTwo = new TextField(10);
   textResult = new TextField(10);
   operatorLabel = new Label("+");
   message = new Label("�㻹û�лش���");
   getProblem = new Button("��ȡ��Ŀ");
   giveAnwser = new Button("ȷ�ϴ�");
   add(getProblem);
   add(textOne);
   add(operatorLabel);
   add(textTwo);
   add(new Label("="));
   add(textResult);
   add(giveAnwser);
   add(message);
   textResult.requestFocus();
   textOne.setEditable(false);
   textTwo.setEditable(false);
   getProblem.addActionListener(this);
   giveAnwser.addActionListener(this);
   textResult.addActionListener(this);
   setBounds(100, 100, 450, 100);
   setVisible(true);
   validate();
   addWindowListener(new WindowAdapter()
   {
    public void windowClosing(WindowEvent e)
    { 
      System.exit(0);
    }
   }
    );
  }
   public void actionPerformed(ActionEvent e)
  {
   if (e.getSource() == getProblem)
   { 
     int number1 = teacher.giveNumberOne(100);
     int number2 = teacher.giveNumberTwo(100);
     String operator = teacher.giveOperator();
     textOne.setText("" + number1);
     textTwo.setText("" + number2);
     operatorLabel.setText(operator);
     message.setText("��ش�");
     textResult.setText(null);
   }
   if (e.getSource() == giveAnwser)
    {
      String answer = textResult.getText();
      try
    {
     int result = Integer.parseInt(answer);
     if (teacher.getRight(result) == true)
      {
        message.setText("��ش���ȷ");
     }
     else
     {
      message.setText("��ش����");
     }
    }
    catch (NumberFormatException ex)
    {
       message.setText("�����������ַ�");
    }
   }
    textResult.requestFocus();
    validate();
   }
  }