public class MainClass{
  public static void main(String [] args){
  ShowBoard board = new ShowBoard();
  board.showMess(new OutEnglish());//��OutEnglish�ĵ�ַ���ݸ�ShowBoard�Ĳ���
  board.showMess(new OutAlphabet()
      { 
        public void outPut(){
            for(char b = '��';b<='��';b++)
                System.out.printf("%5c",b);
     }
    }
  );
 }
}
             