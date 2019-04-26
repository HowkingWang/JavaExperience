public class Hide extends A{
  int n;
  int f(){
   System.out.println("子类重新定义的n:"+n);
 return n;
          }
 int t(){
   n = super.n;
   System.out.println("被隐藏的n:"+n);
   return n;
  }
}