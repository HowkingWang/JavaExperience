import java.util.*;
class Vehicle{
 double speed;
 int power;
 int S0 = 100;
 double speedUp(int a,int t){
    speed = S0+a*t;
   return speed;
 }
 double speedDown(int a,int t){
  speed = S0-a*t;
  return speed;
  }
 void setPower(int power){
     this.power = power;
  }
 int getPower(){
  return power;
 }
}
public class Use{
  public static void main(String args[]){
 Vehicle Bzen = new Vehicle();
 Bzen.setPower(1000);
 Bzen.getPower();
 System.out.println("Please time of SpeedChange:");
 Scanner reader = new Scanner(System.in); 
 int t = reader.nextInt();
 System.out.println("Please time of accelrate:");
 int a = reader.nextInt();
 System.out.println("Bzens'speed after speedUp:"+Bzen.speedUp(a,t));
 System.out.println("Bzens'speed after speedDown:"+Bzen.speedDown(a,t));
 System.out.println("The Power of Bzen:"+Bzen.getPower());
 }
}

   
