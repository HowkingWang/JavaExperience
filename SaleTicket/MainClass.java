public class MainClass{
  public static void main(String [] args){
        Thread A,B;
        SaleTicket officer = new SaleTicket();
          A = new Thread(officer);
          B = new Thread(officer);
          A.setName("A");
          B.setName("B");
           A.start();
           B.start();
       }
}