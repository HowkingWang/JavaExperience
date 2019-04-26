import java.awt.*;
import java.awt.event.*;  
public class LetterLabel extends Button implements FocusListener,MouseListener
 {  LetterLabel()
     {  setEditable(false);
        addFocusListener(this);
        setBackground(Color.cyan);
         setFont(new Font("",Font.BOLD,30));
    }
       public static  LetterLabel[] getLetterLabel(int n)
    {  LetterLabel a[]=new LetterLabel[n];
       for(int k=0;k<a.length;k++)
       {  a[k]=new LetterLabel();
         }
       return a;
    }
     public void focusGained(FocusEvent e)
     {
       setBackground(Color.red);
       }
     public void focusLost(FocusEvent e)
    {
      setBackground(Color.cyan);
      }
     public void mousePressed(MouseEvent e)
     {  requestFocus();
    }
     public void setText(char c)
    { setLabel(""+c);
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
 }