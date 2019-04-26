public class mainClass{
 public static void main(String [] args){
  ChinaPeople Lishi = new ChinaPeople();
   Lishi.setHeight(127);
   System.out.println("ChinaPeople doesn't inherit for data:"+Lishi.getAverHeight());
   System.out.println("子类实例变量的值："+Lishi.getHeight());
  }
}//继承的方法可以操作未继承的变量

