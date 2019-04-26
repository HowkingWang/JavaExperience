public class CalendarMainClass
  { public static void main(String args[])
    {   CalendarFrame frame=new CalendarFrame();
       frame.setBounds(100,100,360,300);
       frame.setVisible(true); 
       frame.validate();
        frame.addWindowListener(new java.awt.event.WindowAdapter()
     {  public void windowClosing(java.awt.event.WindowEvent e) 
          {  System.exit(0); 
        } 
     } 
   );
   }
 }