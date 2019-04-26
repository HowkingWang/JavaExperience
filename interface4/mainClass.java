public class mainClass{
  public static void main(String [] args){
   KindHello kindhello = new KindHello();
   kindhello.lookHello(new China());
   kindhello.lookHello(new America());
   kindhello.lookHello(new British());//接口参数直接回调就实现类需要的接口功能
 }
}