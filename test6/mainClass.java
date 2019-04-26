public class mainClass{
  public static void main(String [] args){
   double x[] = {5.0,7.9,6.5,9.7,9.8,9.6};
   double y[] = {6.0,7.8,8.9,9,8};
   ComputerAverage computer;
   computer = new Gymnastics();
   double result = computer.average(x);
   System.out.printf("%n");
   System.out.printf("Player score:%6f",result);
   computer = new School();
    result = computer.average(y);
   System.out.printf("Average Score of Class:%5.0f",result);
  }
}