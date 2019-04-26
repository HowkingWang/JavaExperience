public class MainClass{
  public static void main(String [] args){
  ShowBoard board = new ShowBoard();
  board.showMess(new OutEnglish());//将OutEnglish的地址传递给ShowBoard的参数
  board.showMess(new OutAlphabet()
      { 
        public void outPut(){
            for(char b = 'α';b<='ω';b++)
                System.out.printf("%5c",b);
     }
    }
  );
 }
}
             