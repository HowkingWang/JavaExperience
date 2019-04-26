public class MainClass{
  public static void main(String [] args){
          BuyTicket officer = new BuyTicket();
          Thread zhangfei,likui;
           zhangfei = new Thread(officer);
           likui = new Thread(officer);
           likui.setName("¿ÓÂ”");
           zhangfei.setName("’≈∑…");
            zhangfei.start();
            likui.start();
   }
}