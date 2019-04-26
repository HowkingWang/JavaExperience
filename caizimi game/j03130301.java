import java.lang.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class j03130301 extends Frame implements Runnable
{
  Label L1,L2;
  TextField text1,text2;
  Button B1;
  List list1;
  public j03130301()
  {
    this.setLayout( null );
    //========================================
    L1 = new Label("对方 IP：");
    L1.setBounds(10,30,60,30);
    this.add(L1);
    L2 = new Label("发言：");
    L2.setBounds(10,70,60,30);
    this.add(L2);       
    text1 = new TextField("127.0.0.1", 20);
    text1.setBounds(75,30,200,30);
    this.add(text1);
    text2 = new TextField();
    text2.setBounds(75,70,320,30);
    this.add(text2);          
    B1 = new Button("send");
    B1.setBounds(400,70,60,30);
    B1.addMouseListener( new myMouseListener() ); 
    this.add(B1);
    list1 = new List(15);
    list1.setBounds(15,110,450,300);
    this.add(list1); 
    //========================================
    this.addWindowListener(new WindowAdapter() 
    {
      public void windowClosing(WindowEvent e)
      {
        System.exit(0);
      } 
    });
    this.setTitle("使用 UDP 的网络聊天程序");
    this.setBounds(100,100,480,430);
    this.setVisible( true );
  }//public j03130301() end
  public void run()  
  {  //接收数据
     while( true )
     { //持续接收送到本地端的信息
        byte[] buf = new byte[100];//预期最多可收 100 个 byte
        try
        {         
          DatagramSocket DS = new DatagramSocket( 2222 ); 
                                  //用 2222 port 收
            /* 只管接收要送到本地端 2222 port 的数据包，
               不必管该数据包是从远程的那个 port 送出。 */
          DatagramPacket DP = new DatagramPacket( buf,buf.length );
                                              //将数据收到 buf 数组
          DS.receive( DP ); //接收数据包
          list1.add( "来自 " + DP.getAddress().getHostAddress()
                     + ":" + DP.getPort() + " ＞"          
                     + new String( buf ).trim()  );
              //此处用 new String(DP.getData()).trim() 也一样
          DS.close();
          Thread.sleep(200); //停 0.2 秒
        }
        catch(Exception excep){}
     }
  } // void run() end
  
  class myMouseListener extends MouseAdapter
  {  //送数据
    public void mouseClicked(MouseEvent e)
    { //每次 Click 按钮就发送信息到目的端主机      
      String msg = text2.getText().trim();   
      String ipStr = text1.getText().trim();
      try
      {
        DatagramSocket DS = new DatagramSocket();
                                //以任一目前可用的port 送
        DatagramPacket DP 
          = new DatagramPacket( msg.getBytes(),
                                msg.getBytes().length,
                                InetAddress.getByName(ipStr),
                                2222 ); //送到远程的 2222 port
        DS.send( DP ); //送出数据包
        list1.add( "送出：" + msg.trim() ); //给自己看的记录
        DS.close();
      }
      catch(Exception excep){}
    } //void mouseClicked(MouseEvent e) end
  } //class myMouseListener end
 
  public static void main(String arg[])
  {
    j03130301 Form1 = new j03130301();      
    Thread threadObj = new Thread( Form1 );
    threadObj.start();//启动接收信息的线程
  } //void main(String arg[]) end
} //class j03130301 end