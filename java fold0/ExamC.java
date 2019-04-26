public class ExamC{
 public static void main(String args[]){
     Battery nanfu = new Battery(100);
     System.out.println("Battery Amount:"+nanfu.EleAmount);
     Radio radio = new Radio();
     System.out.println("Star use radio:");
     radio.openRadio(nanfu);
     System.out.println("BatteryAmount:"+nanfu.EleAmount);
    }
}
   
  