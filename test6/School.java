public class School implements ComputerAverage{
   public double average(double s[]){
     int n = s.length;
     double aver = 0;
    for(int i = 0;i<n;i++){
        aver = aver+s[i];
      } 
    aver = aver/n;
    return aver;
  }
 }