class Family{
 TV homeTV;
 void buyTV(TV tv){
  homeTV = tv;
 }
 void remoteControl(int m){
  homeTV.setChannel(m);
 }
 void seeTV(){
    homeTV.showProgram();
 }
}
class TV{
 int channel;
 void setChannel(int m){
  if(m>=1){
   channel = m;
    }
   }
 int getChannel(){
  return channel;
 }
 void showProgram(){
   switch(channel){
    case 1:
     System.out.println("CCTV1");
      break;
    case 2:
      System.out.println("CCTV6");
       break;
   case 3:
     System.out.println("CCTV3");
      break;
   case 4:
     System.out.println("CCTV5");
      break;
   case 5:
     System.out.println("CCTV7");
      break;
  case 6:
     System.out.println("CCTV12");
      break;
  case 7:
     System.out.println("CCTV11");
      break;
    default :
       System.out.println("Can't show!!!");
     
   }
 }
}
public class MainClass{
 public static void main(String args[]){
  TV haierTV = new TV();
  haierTV.setChannel(2);
  System.out.println("channel of hairerTV:"+haierTV.getChannel());
  Family zhangsan = new Family();
  zhangsan.buyTV(haierTV);
  System.out.println("zhangsan starts watch TV");
  zhangsan.seeTV();
  int m = 1;
  System.out.println("remote Channel by zhangsan:"+m+"Channel");
  zhangsan.remoteControl(m);  
System.out.println("ChannelofhaierTV:"+haierTV.getChannel());
  System.out.println("zhangsan is watching TVshow");
  zhangsan.seeTV();
  }
}
