import java.awt.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.*;
public class TreeWin extends JFrame implements ActionListener{
  JTextArea show;
  JTree tree;
   TreeWin(){
     DefaultMutbleTreeNode root = new DefaultMutbleTreeNode("films");
     DefaultMutbleTreeNode nodeComedy = new DefaultMutbleTreeNode("Comedy");
     DefaultMutbleTreeNode nodeAction = new DefaultMutbleTreeNode("Action");
     DefaultMutbleTreeNode nodeLuv = new DefaultMutbleTreeNode("LUV");
   DefaultMutbleTreeNode comedy1 = new DefaultMutbleTreeNode("comedy by zxc");
   DefaultMutbleTreeNode comedy2 = new DefaultMutbleTreeNode("comedy by jkr");
   DefaultMutbleTreeNode comedy3 = new DefaultMutbleTreeNode("comedy by other");
   DefaultMutbleTreeNode action1 = new DefaultMutbleTreeNode("action by JackCheng");
   DefaultMutbleTreeNode action2 = new DefaultMutbleTreeNode("action by JetLi");
   DefaultMutbleTreeNode luv1 = new DefaultMutbleTreeNode("luv:<珍珠港>");
   DefaultMutbleTreeNode luv2 = new DefaultMutbleTreeNode("luv:<恋空>");
   DefaultMutbleTreeNode luv3 = new DefaultMutbleTreeNode("luv:<男人百分百>");
    root.add(nodeComedy);
    root.add(nodeAction);
    root.add(nodeLuv);
    nodeComedy.add(comedy1);
    nodeComedy.add(comedy2);
    nodeComedy.add(comedy3);
    nodeAction.add(action1);
    nodeAction.add(action2);
    nodeLuv.add(luv1);
    nodeLuv.add(luv2);
    nodeLuv.add(luv3);
      tree = new JTree();
      tree.addTreeSelectionListener(this);
       show = new JTextArea(20,26);
       setLayout(new GridLayout(1,2));
       add(new JScrollPane(tree));
       add(new JScrollPane(show));
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLLOSE);
       setBounds(100,100,600,800);
      }
    public void valueChanged(TreeSelsctionEvent e){
           DefaultMutbleTreeNode node = (DefaultMutbleTreeNode)tree.getLastSelectedPathComponent();
          if(node.isLeaf()){
               Kinds k = (Kinds)node.getUseObject();
               show.append(k.name+"\n");
              }
           else{
            show.setText(null);
     }
   }
}