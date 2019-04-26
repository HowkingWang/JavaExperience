import java.awt.*;
import javax.swing.*;
import java.awt.event.InputEvent;
public class ComponentInWindows extends JFrame{
  JButton button;
  JTextField text;
  JTextArea area;
  JCheckBox checkBox1,checkBox2,checkBox3;
  JRadioButton radio1,radio2;
  ButtonGroup group;
  JComboBox comBox;
  JMenu menu;
  public ComponentInWindows(){
    init();
    setBackground(Color.red);
    setSize(678,908);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    //setExtendState(MAXIMZED);
    //JFrame(String s);
  }
  void init(){
   setLayout(new FlowLayout());
    add(new JLabel("button"));
    button = new JButton("Yes");
    add(button);
    add(new JLabel("UseName"));
    text = new JTextField(10);
    add(text);
    add(new JLabel("Your Imfomation"));
    area = new JTextArea(10,20);  
    add(new JScrollPane(area));
    add(new JLabel("Sex"));
    group = new ButtonGroup();
    radio1 = new JRadioButton("Man");
    radio2 = new JRadioButton("Woman");
    group.add(radio1);
    group.add(radio2);
    add(radio1);
    add(radio2);
    add(new JLabel("ComBox"));
    comBox = new JComboBox();
    comBox.addItem("World of Music");
    comBox.addItem("Sports");
    comBox.addItem("Films");
    add(comBox);
    add(new JLabel("MultiOption"));
     group = new ButtonGroup();
    checkBox1 = new JCheckBox("Like Music");
    checkBox2 = new JCheckBox("Like Films");
    checkBox3 = new JCheckBox("Like Sports");
     group.add(checkBox1);  
     group.add(checkBox2); 
     group.add(checkBox3);
     add(checkBox1);  
    add(checkBox2); 
    add(checkBox3);
    add(new JLabel("MenuOption"));
    menu = new JMenu("Registion of Personal imformation");
    add(menu);
   }
}