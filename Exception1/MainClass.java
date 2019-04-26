public class MainClass{  
  public static void main(String [] args){
   Bank bankOfWorld = new Bank();
   try{
        bankOfWorld.income(12323,-54563);
        bankOfWorld.income(14353,-93045);
        bankOfWorld.income(90809,42424);
        bankOfWorld.income(665232,-99353);
       System.out.printf("The money is %d yuan in Bank"+bankOfWorld.getMoney());
        bankOfWorld.income(1245,-1339);
        bankOfWorld.income(-123,13423);
       }
   catch(BankException e){
       System.out.println("There were some problems follow:");
     
       System.out.println(e.warnMess());
  }
      System.out.printf("The money is %d yuan in Bank"+bankOfWorld.getMoney());
  }
}