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
      System.out.println("偶是"+cowName+"，体重:"+w+"，身高:"+h+"，价格:"+p);
     }
    }
}