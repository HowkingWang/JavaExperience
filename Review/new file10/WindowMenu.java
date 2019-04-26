//import static javax.swing.JFrame.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowMenu extends JFrame{
    JMenu menu,subMenu;
    JButton button;
    JTextField text;
    JTextArea area;
    JMenuItem item1,item2,item3;
    JMenuBar menuBar;
     public WindowMenu(String s,int l,int w,int h,int x){
          init(s);
           setVisible(true);
           setBounds(300,300,600,800);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           validate();
        }
      void init(String s){
               setTitle(s);
               setLayout(new FlowLayout());
               button = new JButton("Sure");
               menu = new JMenu("Star");
               subMenu = new JMenu("Objects");
               item1 = new JMenuItem("topic of Java");
               item2 = new JMenuItem("method of Java");
               item3 = new JMenuItem("merit of Java");
               text = new JTextField(16);
               area = new JTextArea(20,25);
               menuBar = new JMenuBar();

                item1.setAccelerator(KeyStroke.getKeyStroke('A'));
                item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));
                 item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_MASK));
                menu.add(item1);
                menu.addSeparator();
                menu.add(item2);
                menu.add(item3);
                menu.add(subMenu);
                  subMenu.add(new JMenuItem("System of Unverse",new ImageIcon("2.gif")));
                  subMenu.add(new JMenuItem("System of Biology",new ImageIcon("a1.gif")));
                menuBar.add(menu);
                setJMenuBar(menuBar);
               add(new JLabel("Text"));
                add(text);
                 add(new JScrollPane(area));
     
    }
}


  
      
        