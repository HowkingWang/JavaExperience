public class Bank{
  int year;
  int saveMoney;
  double interestRate = 0.0301;
  double interest;
  public double computerInterest(){
  interest = saveMoney*year*interestRate;
    return interest;
  }
 public void setRate(double rate){
   interestRate = rate;
  }
}
   