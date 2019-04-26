import java.awt.event.*;
import javax.swing.*;
public interface DIYListener extends ActionListener{//subInterface
    void setText(JTextField text);
    void setArea(JTextArea showArea);
  }