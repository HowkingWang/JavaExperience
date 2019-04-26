public class Animal implements Runnable{
       double waterAmount;
       Thread dog,cat;
        Animal(){
            dog = new Thread(this);
            cat = new Thread(this);
        }
       public void setWater(double w){
               waterAmount = w;
         }
       public void run(){
             while(true){
                 String name = Thread.currentThread().getName();
                  if(name.equals("Dog")){
                    System.out.println(name+"Drinking");
                  waterAmount = waterAmount-2.2;
           }
                 else if(name.equals("Cat")){
                      System.out.println(name+"Drinking");
                  waterAmount = waterAmount-1.8;
           }
                      System.out.println("The water Remain:"+waterAmount);        
       try{
             Thread.sleep(2000);
         }
         catch(InterruptedException e){}
               if(waterAmount<=0){
                    return;
          }
        }
      }
}