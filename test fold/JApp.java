import java.applet.Applet;
import java.awt.Graphics;
public class JApp extends Applet
{  public void init()
    {  System.out.println("Prepare Start......");    }
   public void start()
    {  System.out.println("Start Program......");    }
  public void stop()
    {  System.out.println("End!yeah!!!");    }
  public void paint(Graphics g)
    {  g.drawString("Hello!    Java!!!",60,60);    }
}
