public class mainClass{
  public static void main(String [] args){
   int money = 10000357;
   ConstructionBank bank1 = new ConstructionBank();
   bank1.saveMoney = money;
   bank1.year = 1.23;
   double interest1 = bank1.computerInterest();
   bank1.setRate(0.32);
   BankofBeijing bank2 = new BankofBeijing();
   bank2.saveMoney = money;
   bank2.year = 3.21;
   bank2.setRate(0.321);
  double interest2 = bank2.computerInterest();
   System.out.printf("saveMoney of BankofBeijing more than saveMoney of ConstructionBank:%f",interest1-interest2 );
  }
}