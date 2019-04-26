public class RedCowForm{
  static String formName;
  RedCow cow;
 RedCowForm(){
     }
  RedCowForm(String s){
     cow = new RedCow(123,122,14500);
     formName = s;
   }
  public void showRedCowMess(){
    cow.speak();
 }
  class RedCow{
    String cowName = "redCow";
     int height,weight,price;
      RedCow(int h,int w,int p){
        height = h;
        weight = w;
        price = p;
   }
  void speak(){
     System.out.println("I am"+cowName+",Height:"+height+"cm Weight:"+weight+"kg,Live in:"+formName);
    }
  }
}
    
  