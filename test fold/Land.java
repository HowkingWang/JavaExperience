import java.util.*;
class Village{
static int waterAmount;
 /*void setWaterAmount(int waterAmount){
  this.waterAmount = waterAmount;
  }
  int getWaterAmount(){
  return waterAmount;
 }*/
 int useWater(int x){
   int useWater;
    useWater = 10*x;
   System.out.println("UseWater Amount:"+useWater);
   return useWater;
 }
 int lookWater(int x){
  
  waterAmount = waterAmount-x*10;
  System.out.println("RemainWaterAmount:"+waterAmount);
  return waterAmount;
  }
}
public class Land{
 public static void main(String args[]){
 Village county1 = new Village();
 Village county2 = new Village();
 Village.waterAmount = 12000000;
 //System.out.println("Please enter useWater time:");
 //Scanner reader = new Scanner(System.in);
 //int x = reader.nextInt();
  county1.useWater(787);
  county2.lookWater(788);
  }
}