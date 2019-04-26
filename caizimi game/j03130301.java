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
    L1 = new Label("�Է� IP��");
    L1.setBounds(10,30,60,30);
    this.add(L1);
    L2 = new Label("���ԣ�");
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
    this.setTitle("ʹ�� UDP �������������");
    this.setBounds(100,100,480,430);
    this.setVisible( true );
  }//public j03130301() end
  public void run()  
  {  //��������
     while( true )
     { //���������͵����ض˵���Ϣ
        byte[] buf = new byte[100];//Ԥ�������� 100 �� byte
        try
        {         
          DatagramSocket DS = new DatagramSocket( 2222 ); 
                                  //�� 2222 port ��
            /* ֻ�ܽ���Ҫ�͵����ض� 2222 port �����ݰ���
               ���عܸ����ݰ��Ǵ�Զ�̵��Ǹ� port �ͳ��� */
          DatagramPacket DP = new DatagramPacket( buf,buf.length );
                                              //�������յ� buf ����
          DS.receive( DP ); //�������ݰ�
          list1.add( "���� " + DP.getAddress().getHostAddress()
                     + ":" + DP.getPort() + " ��"          
                     + new String( buf ).trim()  );
              //�˴��� new String(DP.getData()).trim() Ҳһ��
          DS.close();
          Thread.sleep(200); //ͣ 0.2 ��
        }
        catch(Exception excep){}
     }
  } // void run() end
  
  class myMouseListener extends MouseAdapter
  {  //������
    public void mouseClicked(MouseEvent e)
    { //ÿ�� Click ��ť�ͷ�����Ϣ��Ŀ�Ķ�����      
      String msg = text2.getText().trim();   
      String ipStr = text1.getText().trim();
      try
      {
        DatagramSocket DS = new DatagramSocket();
                                //����һĿǰ���õ�port ��
        DatagramPacket DP 
          = new DatagramPacket( msg.getBytes(),
                                msg.getBytes().length,
                                InetAddress.getByName(ipStr),
                                2222 ); //�͵�Զ�̵� 2222 port
        DS.send( DP ); //�ͳ����ݰ�
        list1.add( "�ͳ���" + msg.trim() ); //���Լ����ļ�¼
        DS.close();
      }
      catch(Exception excep){}
    } //void mouseClicked(MouseEvent e) end
  } //class myMouseListener end
 
  public static void main(String arg[])
  {
    j03130301 Form1 = new j03130301();      
    Thread threadObj = new Thread( Form1 );
    threadObj.start();//����������Ϣ���߳�
  } //void main(String arg[]) end
} //class j03130301 end