import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowInteraction extends JFrame implements ActionListener{
 JButton restart;
 Block block[][];
 BlockView blockView[][];
 LayMine lay;
 int row = 10,column = 12,mineCount = 22;
 int colorSwitch = 0;
 JPanel pCenter,pNorth;
 public WindowInteraction(){
   restart = new JButton("AGAIN");

   restart.setFont(new Font("宋体",Font.PLAIN,25));
   restart.setForeground(Color.blue);

   pCenter = new JPanel();
   pNorth = new JPanel();
   pNorth.setBackground(Color.cyan);
   block = new Block[row][column];
   pCenter.setLayout(new GridLayout(row,column));
      for(int i=0;i<row;i++){
       for(int j=0;j<column;j++)
        block[i][j] = new Block();
    }
   lay = new LayMine();
   lay.layMineForBlock(block,mineCount);
      blockView = new BlockView[row][column];
      pCenter.setLayout(new GridLayout(row,column));
      for(int i=0;i<row;i++){
       for(int j=0;j<column;j++){
         blockView[i][j] = new BlockView();
         blockView[i][j].setName(block[i][j].getName());
         pCenter.add(blockView[i][j]);
         blockView[i][j].getBlockCover().addActionListener(this);  
   }
  }
 restart.addActionListener(this);
 pNorth.add(restart);
 add(pNorth,BorderLayout.NORTH);
 add(pCenter,BorderLayout.CENTER);
 setSize(600,800);
 setVisible(true);
 setTitle("王昊专属小游戏");
 validate();
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 public void actionPerformed(ActionEvent e){
  JButton source=(JButton)e.getSource();
   if(source!= restart){
   int m=-1,n=-1;
    for(int i=0;i<row;i++){
     for(int j=0;j<column;j++){
       if(source==blockView[i][j].getBlockCover()){
         m=i;
         n=j;
         break;
      }
     }
    }
   if(block[m][n].isMine()){
      for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
          blockView[i][j].getBlockCover().removeActionListener(this);
     if(block[i][j].isMine())
      blockView[i][j].seeBlockName();
      }
    }
  }
 else{
   if(block[m][n].getNumber()>0)
      blockView[m][n].seeBlockName();
    else if(block[m][n].getNumber()==0)
      for(int k=Math.max(m-1,0);k<=Math.min(m+1,row-1);k++){
     for(int t=Math.max(n-1,0);t<=Math.min(n+1,column-1);t++)
      blockView[k][t].seeBlockName();
      }
    }
  }
 if(source==restart){
   for(int i=0;i<row;i++){
        for(int j=0;j<column;j++)
         block[i][j].setIsMine(false);
     }
   lay.layMineForBlock(block,mineCount);
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
         blockView[i][j].setName(block[i][j].getName());
         blockView[i][j].seeBlockCover();
         blockView[i][j].getBlockCover().addActionListener(this);
        }
      }
    }
   }
 public static void main(String [] args){
    new WindowInteraction();
   }
}
  
       
      
      
