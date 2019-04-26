public class Bank{
   private int money;
   public void income(int in,int out) throws BankException{
    if(in>=0||out<=0||in+out<=0){
      throw new BankException(in,out);
  }
   int netIncome = in+out;
   System.out.printf("Income:%d yuan\n",netIncome);
 }
  public int getMoney(){
    return money;
   }
  
}
     
  