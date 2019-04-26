import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import static javax.swing.JFrame.*;
public class WindowMenu extends JFrame{
  JMenu menu,subMenu;
  JMenuItem item1,item2,item3;
  JMenuBar menubar;
  public WindowMenu(){};
   public WindowMenu(String s,int x,int y,int w,int h){
    init(s);
    setSize(w,h);
    setLocation(x,y);
    setVisible(true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }
 void init(String s){
   setTitle(s);
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
   subMenu.add(new JMenuItem("System of Study",new ImageIcon("t3.gif")));
   subMenu.add(new JMenuItem("Salor System",new ImageIcon("2.gif")));
   menubar.add(menu);
   setJMenuBar(menubar);
  }
}