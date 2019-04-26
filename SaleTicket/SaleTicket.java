public class SaleTicket implements Runnable{
         int yuan20=2,yuan5=0,yuan50=0;
          public void run(){
            String name = Thread.currentThread().getName();
            if(Thread.currentThread().getName().equals("B")){
                
                  yuan5++;
                  System.out.println("给B一张票");
              }
             else if(Thread.currentThread().getName().equals("A")){
                System.out.println("请靠边等");
                   while(yuan5<1){ 
                            Thread.yield();
                         }
                    
                     }
                  yuan20 = yuan20-2;
                  yuan5--;
                  yuan50++;
               
               System.out.println("给你一张票，找你45元");
    
   }
}