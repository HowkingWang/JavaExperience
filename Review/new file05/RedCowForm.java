public class RedCowForm{
  static String formName;
  RedCow cow;
   public void showMess(){
       cow.speak();
   }
  RedCowForm(String s){
    formName = s;
     cow = new RedCow(150,500,10000);
  }
   class RedCow{
      String cowName = "RedCow";
      int h,w,p;
       RedCow(int h,int w,int p){
              this.h= h;
               this.w=w;
            this.p=p;
         }
    void speak(){
      System.out.println("ż��"+cowName+"������:"+w+"�����:"+h+"���۸�:"+p);
     }
    }
}