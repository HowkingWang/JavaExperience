import java.util.Scanner;
public class InputScore{
  DelScore del;
  InputScore(DelScore del){
    this.del = del;
  }
  public void inputScore(){
  System.out.println("Enter the number of Rater");
  Scanner read = new Scanner(System.in);
  int count = read.nextInt();
  System.out.println("Enter Score by Rater");
  double a[] = new double[count];
  for(int i=0;i<count;i++){
    a[i]=read.nextDouble();
   }
    del.doDelete(a);
 }
}