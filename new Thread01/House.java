public class House implements Runnable{
    int cookies = 28;
    Thread dog,cat;
    House(){
        dog = new Thread(this);//this´ú±íhouse
        cat = new Thread(this);
        }
    public void run(){
       while(true){
          Thread t = Thread.currentThread();
           if(t==dog){
              System.out.println("The dog has ate 2 pice of cakies");
               cookies = cookies-2;
               }
          else if(t==cat){
          System.out.println("The cat has only  ate 1 pice of cakies");
               cookies--;
              }
        try{
             Thread.sleep(2000);
         }
        catch(InterruptedException e){}
                if(cookies<0)
                  return;
          }
        }
}