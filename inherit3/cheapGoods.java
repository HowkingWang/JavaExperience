public class cheapGoods extends goods{
  int weight;
  void newSetWeight(int w){
     weight = w;
   System.out.println("Reset weight="+weight);
  }
 double newGetPrice(){
    double price = 10*weight;
    return price;
  }
}
   