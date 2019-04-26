public class House implements Runnable{
   int cakies=20;
   public void run(){
     while(true){
       String name = Thread.currentThread().getName();
       if(name.equals("dog")){
          System.out.println("The dog has ate 2 pice of cakies");
               cakies = cakies-2;
               }
        else if(name.equals("cat")){
           System.out.println("The cat has only  ate 1 pice of cakies");
               cakies--;
              }
          try{
                Thread.sleep(2000);
            }
          catch(InterruptedException e){}//»½ÐÑ
              if(cakies<0)
               return;
             }
       }
   
}