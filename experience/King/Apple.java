public class Apple{
    public static void main(String [] args){
      PingGuo pg = new PingGuo();
      pg.createApple();
      pg.sale();
  }
}
class PingGuo{
   static int number=20,weight=1;
   public void createApple(){
       number++;
       weight++;
      System.out.println("当前苹果数量："+number+"重量:"+weight);
       }
   public void sale(){
        number--;
        weight--;
     System.out.println("当前苹果数量："+number+"重量:"+weight);
       }
   }
