public class goods{
 double weight;
 void setWeight(double w){
     weight = w;
  System.out.println("weight="+weight);
  }
 public double oldGetPrice(){
    double price = weight*12;
   return price; 
  }
}