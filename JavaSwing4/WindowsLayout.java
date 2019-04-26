import java.awt.*;
import javax.swing.*;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import static javax.swing.JFrame.*;

public class WindowsLayout extends JFrame{
   JComboBox comBox;
   JPanel chessBoard;
   GridLayout grid;
     JButton button;

  JTextField text;
  JTextArea area;
  JCheckBox checkBox1,checkBox2,checkBox3;
  JRadioButton radio1,radio2;
  ButtonGroup group;
  
   JMenu menu,subMenu;
  JMenuItem item1,item2,item3;
  JMenuBar menubar;

    Box box1,box2,baseBox;
    
   WindowsLayout(){
       setSize(567,897);
       setBackground(Color.blue);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       init();
       setVisible(true);
   }
   void init(){
    setLayout(new FlowLayout());
     chessBoard = new JPanel();
       grid = new GridLayout(12,12);
       chessBoard.setLayout(grid);
       Label label[][] = new Label[12][12];
       for(int i=0;i<12;i++){
          for(int j=0;j<12;j++){
            label[i][j] = new Label();
          if((i+j)%2==0)
            label[i][j].setBackground(Color.black);
            else
           label[i][j].setBackground(Color.white);
           chessBoard.add(label[i][j]);   
    }
  }
  add(chessBoard,BorderLayout.CENTER);
  add(new JButton("Natonal of North"),BorderLayout.NORTH);
   add(new JButton("Natonal of South"),BorderLayout.SOUTH);
   add(new JButton("Natonal of West"),BorderLayout.WEST);
   add(new JButton("Natonal of East"),BorderLayout.EAST);
   validate();
   add(chessBoard);
  
   box1 = Box.createVerticalBox();
   box1.add(new JLabel("Password"));
   box1.add(Box.createVerticalStrut(10));
   box1.add(new JLabel("email"));
   box1.add(Box.createVerticalStrut(5));
   box1.add(new JLabel("Perfession"));
   box2 = Box.createVerticalBox();
   box2.add(new JTextField(12));
   box2.add(Box.createVerticalStrut(5));
   box2.add(new JTextField(10));
   box2.add(Box.createVerticalStrut(5));
   box2.add(new JTextField(10));
   box2.add(box1);
   baseBox = Box.createVerticalBox();
   baseBox.add(box1);
   baseBox.add(Box.createVerticalStrut(12));
   baseBox.add(box2);
   add(baseBox);

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

   menu = new JMenu("menu");
   subMenu = new JMenu("menu of software");
   menubar = new JMenuBar();
   item1 = new JMenuItem("javaWindow",new ImageIcon("a1.gif"));
   item2 = new JMenuItem("topic of java",new ImageIcon("2.jpg"));
   item3 = new JMenuItem("haha lalala",new ImageIcon("t3.jpg"));
   item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,InputEvent.CTRL_MASK));
   item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
   item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,InputEvent.CTRL_MASK));
   menu.add(item1);
   menu.addSeparator();
   menu.add(item2);
   menu.add(item3);
   menu.add(subMenu);
   add(menu);
   subMenu.add(new JMenuItem("System of Study",new ImageIcon("t3.gif")));
   subMenu.add(new JMenuItem("Salor System",new ImageIcon("2.gif")));
   menubar.add(menu);
   setJMenuBar(menubar);
   add(subMenu);
  

  }
}
    

