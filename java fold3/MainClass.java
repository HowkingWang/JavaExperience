public class MainClass{
  public static void main(String args[]){
    SIM simOne = new SIM(13912345567L);
    MobilePhone mobile = new MobilePhone();
    mobile.setSIM(simOne);
    System.out.println("Tel.1:"+mobile.lookNumber());
    SIM simTwo = new SIM(12334559988L);
    mobile.setSIM(simTwo);
    System.out.print("Tel.2£º"+mobile.lookNumber());
     
  }
}
    
    
