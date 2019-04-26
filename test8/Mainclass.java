
interface CatState{
  public void showState();
}
class SoftlyState implements CatState{
  public void showState(){
    System.out.println("Menemenda");
   }
}
class MeetEnemyState implements CatState{
  public void showState(){
    System.out.println("Calm");
   }
}
class SeeFoodsState implements CatState{
  public void showState(){
    System.out.println("Jump");
   }
}
class Cat {
  CatState state;
  public void show(){
    state.showState();
  }
  public void setState(CatState s){
    state=s;
  }
}
public class Mainclass{
  public static void main(String args[]){
    Cat LuckCat=new Cat();
    System.out.print("See host");
    LuckCat.setState(new SoftlyState());
    LuckCat.show();
    System.out.print("when it see competition");
    LuckCat.setState(new MeetEnemyState());
    LuckCat.show();
    System.out.print("when it see food");
    LuckCat.setState(new SeeFoodsState());
    LuckCat.show();
  }
}
