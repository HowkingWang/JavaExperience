import javax.swing.*;
import java.awt.*;
public class ComponentInWindow extends JFrame{
  JTextField text;
  JTextArea textArea;
  JButton button1,button2;
  JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;
  ButtonGroup group;
  JRadioButton radio1,radio2;
  JComboBox comboBox;
  JPasswordField password;
    public ComponentInWindow(){
      init();
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
  void init(){
     setLayout(new FlowLayout());
     add(new JLabel("TextFiled"));
     text = new JTextField(8);
     add(text);
     add(new JLabel("Button"));
     button1 = new JButton("Yes");
     add(button1);
     button2 = new JButton("No");
     add(button2);
     add(new JLabel("TextArea"));
     textArea = new JTextArea(7,13);
     add(new JScrollPane(textArea));
     add(new Label("checkBox"));
     checkBox1 = new JCheckBox("Like Music");
     checkBox2 = new JCheckBox("Like Sport");
     checkBox3 = new JCheckBox("Like Films");
     checkBox4 = new JCheckBox("Like Reading");
     add(checkBox1);
     add(checkBox2);
     add(checkBox3);
     add(checkBox4);
     add(new JLabel("SingleButton"));
     group = new ButtonGroup();
     radio1 = new JRadioButton("Man");
     radio2 = new JRadioButton("Woman");
     group.add(radio1);
     group.add(radio2);
     add(radio1);
     add(radio2);
     add(new JLabel("ComboBox"));
     comboBox = new JComboBox();
     add(comboBox);
     comboBox.addItem("Ping-pong bat");
     comboBox.addItem("Basketball");
     comboBox.addItem("Taylor Swift");
     comboBox.addItem("Katy Perry");
     add(comboBox);
  }
}
     
 
