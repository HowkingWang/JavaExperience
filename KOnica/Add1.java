class Computer{
   int add(int a,int b){
      return a+b;
 }
}
public class Add1{
  public static void main(String args[]){
   Computer com = new Computer();
    int x = 100,y = 200;
   int sum = com.add(x,y);
    System.out.println("Sum="+sum);
    int result = com.add(x+133,y+12);
     System.out.println(result);
    }
}