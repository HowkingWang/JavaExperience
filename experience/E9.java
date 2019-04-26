import java.awt.*;  
import javax.swing.event.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class E9{  
public static void main(String args[]) { 
Computer fr=new Computer();
fr.setTitle("计算") ;
 } 
} 
 
class Computer extends JFrame implements DocumentListener { 
JTextArea text1,text2; 
int count=1;  
double sum=0,aver=0; 
Computer() {  
setLayout(new FlowLayout()); 
text1=new JTextArea(6,20); 
text2=new JTextArea(6,20); 
add(new JScrollPane(text1)); 
add(new JScrollPane(text2)); 
text2.setEditable(false); 
(text1.getDocument()).addDocumentListener(this); 
setSize(300,320); 
setVisible(true); 
validate();  
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
} 

public void changedUpdate(DocumentEvent e) { 
String s=text1.getText(); 
String []a =s.split("[^0123456789.]+"); 
sum=0; 
count=0;
aver=0; 
for(int i=0;i<a.length;i++) {  
try { sum=sum+Double.parseDouble(a[i]); 
count++;
}  
catch(Exception ee) {} 
}  
aver=sum/count; 
text2.setText(null); 
text2.append("\n和:"+sum); 
text2.append("\n平均值:"+aver); 
} 
public void removeUpdate(DocumentEvent e){ 
changedUpdate(e); 
}  
public void insertUpdate(DocumentEvent e){ 
changedUpdate(e); 
} 
} 
