public class BankException extends Exception{
   String message;
   public BankException(int m,int n){
    message = "入账"+m+"是负数或支出是"+n+"正数，出现异常：不符合银行系统要求";
  }
  public String warnMess(){
     return message;
  }
}
  