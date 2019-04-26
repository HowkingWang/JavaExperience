public class Gymnastics implements ComputerAverage{
  public double average(double s[]){
    int n = s.length;
    double aver = 0,temp = 0;
     for(int i = 0;i<n;i++){
       for(int j = i;j<n;j++){
       if(s[i]<s[j]){
        temp = s[i];
        s[j] = s[i];
        s[i] = temp;
      } 
     }
   }
    for(int i =1;i<n-1;i++){
      aver = aver+s[i];
  }  
  if(n>2)
   aver = aver/(n-2);
  else
     aver = 0;
   return aver;
 }
}
