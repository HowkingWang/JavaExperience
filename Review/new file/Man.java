public class Man extends People{
   boolean marrage;
   Man(String name,String edu,int age,boolean b){
         super(name,edu,age);
         marrage = b;
        System.out.println("Marrage:"+b);
    }
}
  
   