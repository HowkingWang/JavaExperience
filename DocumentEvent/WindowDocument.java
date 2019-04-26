import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowDocument extends JFrame{
  JMenu menu;
  JMenuBar menuBar;
  JTextArea inputText,showText;
  JMenuItem itemCopy,itemPaste,itemCut;
  TextListener textChangeListener;
  HandleListener handleListener;

  WindowDocument(){
   init();
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setBackground(Color.BLUE);
   setSize(800,900);
   setVisible(true);
   setLayout(new FlowLayout());
   }

  public void init(){
    inputText = new JTextArea(20,26);
    showText = new JTextArea(20,26);
    showText.setLineWrap(true);
    showText.setWrapStyleWord(true);
    menuBar = new JMenuBar();
    menu = new JMenu("Editor");
    itemPaste = new JMenuItem("Paste");
    itemCopy = new JMenuItem("Copy");
    itemCut = new JMenuItem("Cut");
    itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));
    itemCut.setAccelerator(KeyStroke.getKeyStroke('t'));
    itemPaste.setAccelerator(KeyStroke.getKeyStroke('p'));
    itemCopy.setActionCommand("copy");
    itemCut.setActionCommand("cut");
    itemPaste.setActionCommand("paste");
    menu.add(itemCopy);
    menu.add(itemCut);
    menu.add(itemPaste);
    menuBar.add(menu);
    setJMenuBar(menuBar);
    add(new JScrollPane(inputText));
    add(new JScrollPane(showText));
    textChangeListener = new TextListener();
    handleListener = new HandleListener();
    textChangeListener.setInputText(inputText);
    textChangeListener.setShowText(showText);
    handleListener.setInputText(inputText);
    handleListener.setShowText(showText);
    (inputText.getDocument()).addDocumentListener(textChangeListener);
    itemCopy.addActionListener(handleListener);
    itemCut.addActionListener(handleListener);
    itemPaste.addActionListener(handleListener);
   }
}
    