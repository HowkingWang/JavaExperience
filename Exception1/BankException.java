public class BankException extends Exception{
   String message;
   public BankException(int m,int n){
    message = "����"+m+"�Ǹ�����֧����"+n+"�����������쳣������������ϵͳҪ��";
  }
  public String warnMess(){
     return message;
  }
}
  