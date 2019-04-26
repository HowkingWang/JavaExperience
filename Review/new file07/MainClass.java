public class MainClass{
  public static void main(String [] args){
    Calculater calc = new Calculater();
    System.out.println(calc.calclate(12,13));
    System.out.println(calc.calclate(12L,13L));
    System.out.println(calc.calclate(12.0f,13.0f));
     System.out.println(calc.calclate(12.0,13.0));
      System.out.println(calc.calclate(12.0f,13.0));
      System.out.println(calc.calclate(12,13L));
  }
}