public class Man extends People{
   String health,edu;
 Man(String name,int age,String e,String h){
      super(name,age);
      edu = e;
     health = h;
     }
 public void show(){
            System.out.println("Statement of Health:"+health);
      System.out.println("Rank of education:"+edu);
     }
}
  