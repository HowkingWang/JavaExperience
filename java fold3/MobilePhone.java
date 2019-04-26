public class MobilePhone{
  SIM sim;
  void setSIM(SIM card){
   sim = card;
  } 
  long lookNumber(){
     return sim.getNumber();
  }
}
