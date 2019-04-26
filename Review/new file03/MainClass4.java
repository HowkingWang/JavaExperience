public class MainClass4{
   public static void main(String [] args){
        KindHello styleHello = new KindHello();
         styleHello.kindHello(new Chinese());
         styleHello.kindHello(new American());
         styleHello.kindHello(new English());//接口变量的方便
   }
}