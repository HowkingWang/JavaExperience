public class DelScore{
  ComputerAver computer;
  DelScore(ComputerAver computer){
    this.computer = computer;
 }
  public void doDelete(double a[]){
    java.util.Arrays.sort(a);
    System.out.println("Cancel heghest score:"+a[a.length-1]+",");
    System.out.print("Cancel lowest score:"+a[0]+"��");
    double b[] =new double[a.length-2];
    for(int i=1;i<a.length-1;i++){
      b[i-1] = a[i];
     }
    computer.giveAver(b);
  }
}