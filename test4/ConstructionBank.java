public class ConstructionBank extends Bank{
 double year;
 public double computerInterest(){
 super.year = (int)year;
 double r = year - (int)year;
 int day = (int)(r*1000);
 double yearInterest = super.computerInterest();
 double dayInterest = day*interest*saveMoney;
 double interest = dayInterest+yearInterest;
 System.out.println("SaveMoney of ConstructionBank this year:"+interest);
  return interest;
  }
}
 