public class Array{
  public static void main(String args[]){
  int a[] = {12,24,13,43,536,760};
  int b[] = {41,141,53};
  b = a;
  System.out.println("Address of Array:"+a);
  System.out.println("Array:"+b);
  System.out.println("Long of Array:"+a.length);
  System.out.print("a[0]="+a[0]);
  }
 }