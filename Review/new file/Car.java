public class Car{
  String brand;
  static int price,number = 100;
  Car(String brand,int price){
        this.brand = brand;
        this.price = price;
     System.out.println("Ʒ�ƣ�"+brand  +"�۸�(��):"+price);
   }//ʵ��������ʼ��
   public int createCar(){
       number++;
     System.out.println("����"+number);
        return number;
  }
  public int sale(){
       number--;
      System.out.println("����"+number);
          return number;
   }
}
   