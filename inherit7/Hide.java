public class Hide extends A{
  int n;
  int f(){
   System.out.println("�������¶����n:"+n);
 return n;
          }
 int t(){
   n = super.n;
   System.out.println("�����ص�n:"+n);
   return n;
  }
}