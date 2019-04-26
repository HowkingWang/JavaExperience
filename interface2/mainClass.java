public class mainClass{
  public static void main(String [] args){  
   Bus bus5 = new Bus();
   bus5.brake();
   bus5.moneyFare();
    Taxi taxi123 = new Taxi();
    taxi123.brake();
    taxi123.moneyFare();
    taxi123.controlTemperature();
   Cinema dadiCinema = new Cinema();
   dadiCinema.controlTemperature();
   dadiCinema.moneyFare();
  }
}