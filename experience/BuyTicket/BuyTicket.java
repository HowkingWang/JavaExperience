public class BuyTicket implements Runnable{
   int fiveMoney = 2,twentyMoney = 0;
    public void run(){
      if(Thread.currentThread().getName().equals("’≈∑…")){
            saleTicket(20);
       }
    else if(Thread.currentThread().getName().equals("¿ÓÂ”")){
            saleTicket(5);
       }
  }
     private synchronized void saleTicket(int money){
              if(money==5){
                fiveMoney++;
            System.out.println("Giving"+Thread.currentThread().getName()+"Ticket,"+"It's suit money of"+Thread.currentThread().getName());
            }
      else if(money==20){
             while(fiveMoney<3){
                 try{System.out.println("\n"+Thread.currentThread().getName()+"keep wait!");
         wait();
          
            System.out.println("\n"+Thread.currentThread().getName()+"keep buy tiket");
         }
         catch(InterruptedException e){}
       }
        fiveMoney = fiveMoney-3;
        twentyMoney++;
          System.out.println("Giving"+Thread.currentThread().getName()+"Ticket,"+Thread.currentThread().getName()+"return 15Yuan");
              }
      notifyAll();
    }
}
