import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;    
public class FontDialog extends JDialog implements  ItemListener,ActionListener{        
    FontFamily ff;  
    JComboBox jb;  
    String name;  
    String []name1;  
    JLabel lb;  
    JButton bt1,bt2;  
    JPanel panel;        
    public  String getStyle(){  
        return name;  
    }        
    FontDialog(){  
        ff = new FontFamily();  
        jb = new JComboBox();  
        name1 = ff.getFont();  
        for(int i=0; i<name1.length; i++){  
            jb.addItem(name1[i]);  
        }  
                    
        jb.addItemListener(this);            
        lb = new JLabel("����Ч����ʾ");            
        bt1 = new JButton("YES");  
        bt1.addActionListener(this);            
        bt2 = new JButton("NO");  
        bt2.addActionListener(this);            
        panel =  new JPanel(new FlowLayout());            
        this.setLayout(new BorderLayout());  
        this.add(jb,BorderLayout.NORTH);  
        this.add(lb,BorderLayout.CENTER);    
        panel.add(bt1);  
        panel.add(bt2);  
        this.add(panel,BorderLayout.SOUTH);    
        this.setBounds(80, 180, 500, 400);  
        this.setVisible(true);    
        this.setTitle("��������ѡ��Ի���");  
    }   
    public void actionPerformed(ActionEvent e) {   
        if(e.getSource() == bt1){  
            lb.setFont(new Font(name,Font.PLAIN,20));  
        }  
        if(e.getSource() == bt2){  
            Font f = new Font(null);  
            lb.setFont(f);  
            lb.setText("����Ч����ʾ");  
        }  
    }   
    public void itemStateChanged(ItemEvent e) {            
        if(e.getSource() == jb){  
            name = (String)jb.getSelectedItem();  
              
        }  
    }     
}  