 class B{
   
   int n;
   static int sum=0;
   void setN(int n){
    this.n=n;
  }
  int main(){
   for(int i=1;i<=n;i++){
      sum = sum+i;
  }
   return sum;
    }
  
}
public class ExamQ{
  public static void main(String args[]){
   B c1 = new B(),c2 = new B();
   //c1.setN(3);
   c2.setN(5);
   //int s1=c1.main();
   int s2=c2.main();
 System.out.println(s2);
  }
}