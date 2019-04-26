import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;   
public class FrameHaveDialog extends JFrame implements ActionListener {  
      
    JButton bt;   
    JTextArea ta;  
    JPanel panel;  
    FontDialog fontd;  
      
    FrameHaveDialog()  
    {  
        fontd=new FontDialog();  
          
        bt = new JButton("设置字体");  
        bt.addActionListener(this);  
        ta = new JTextArea("Java窗体练习。。。。");  
        panel = new JPanel(new FlowLayout());  
          
        panel.add(bt);  
        this.setLayout(new BorderLayout());  
        this.add(panel,BorderLayout.NORTH);
        this.add(ta);  
          
        panel.setFont(new Font("宋体",Font.PLAIN,20));  
        ta.setFont(new Font("宋体",Font.PLAIN,20));  
        this.setTitle("字体设置窗口");  
        this.setBounds(600, 180, 500, 400);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);  
    }
         public void actionPerformed(ActionEvent e) {  
            if(e.getSource() == bt){  
                Font f = new Font(fontd.getStyle(),Font.PLAIN,20);  
                ta.setFont(f);  
            }  
    }  
}    