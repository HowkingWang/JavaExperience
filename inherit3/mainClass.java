public class mainClass{
  public static void main(String [] args){
  cheapGoods tv = new cheapGoods();
  tv.setWeight(123.1);
  System.out.println("Tv OldPrice"+tv.oldGetPrice());
  tv.newSetWeight(1223);
  System.out.println("weight of tv:"+tv.weight);
   tv.newSetWeight((int)123.87);
  System.out.println("Tv newPrice"+tv.newGetPrice());
  }
}
  
  