package T;
import java.awt.*;
import javax.swing.*;
public class WindowComponent extends JFrame{
     JButton button;
     JTextArea area;
     JTextField text;
     JComboBox comboBox;
     JRadioButton radio1,radio2;
     ButtonGroup group;
     JCheckBox checkBox1,checkBox2;
     
      public WindowComponent(){
           init();
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setBackground(Color.blue);
           validate();
       }

        void init(){
               setLayout(new FlowLayout());
               add(new JLabel("Field of Text"));
                text = new JTextField(13);
                add(text);
                add(new JLabel("Button"));
                button = new JButton("Sure");
                add(button);                
                 add(new JLabel("chooseBox"));
                 checkBox1 = new JCheckBox("Music Passion");
                 checkBox2 = new JCheckBox("Passion of film");
                  add(checkBox1);
                  add(checkBox2);
                add(new JLabel("RadioButton"));
                group = new ButtonGroup();
                 radio1 = new JRadioButton("Men");
                 radio2 = new JRadioButton("Women");
                 group.add(radio1);
                 group.add(radio2);
                 add(radio1);
                 add(radio2);
                 add(new JLabel("ComboBox"));  
                 comboBox = new JComboBox();
                  comboBox.addItem("Word of Music");
                  comboBox.addItem("Heaven of films");
                  comboBox.addItem("Space of Learning");
                  add(comboBox);
                add(new JLabel("Area of Text"));
                area = new JTextArea(6,12);
                add(new JScrollPane(area));
      }
}   