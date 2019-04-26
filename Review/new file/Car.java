public class Car{
  String brand;
  static int price,number = 100;
  Car(String brand,int price){
        this.brand = brand;
        this.price = price;
     System.out.println("品牌："+brand  +"价格(万):"+price);
   }//实现类对象初始化
   public int createCar(){
       number++;
     System.out.println("数量"+number);
        return number;
  }
  public int sale(){
       number--;
      System.out.println("数量"+number);
          return number;
   }
}
   