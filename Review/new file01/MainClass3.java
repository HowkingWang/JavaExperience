public class MainClass3{
  public static void main(String [] args){
      Pillar pillar;
      Geometry bottom;
      bottom = new Rectangle(12,18);  //用超类声明对象 子类创建对象（上转）
      pillar = new Pillar(bottom,80);
       System.out.println("Volume of Pillar="+pillar.getVolum());
        bottom = new Circle(19);
       pillar = new Pillar(bottom,100);
      System.out.println("Volume of Pillar="+pillar.getVolum());
  }
}