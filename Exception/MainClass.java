public class MainClass{
 public static void main(String [] args){
   int a = 0, b = 0, c= 88888888;
    try{
     a = Integer.parseInt("666666");
     b = Integer.parseInt("ab89");
     c = 222222;
  }
 catch(NumberFormatException e){
    System.out.println("Exception:"+e.getMessage());
  }
   System.out.println("a="+a+",b="+b+",c="+c);
 try{ 
   System.out.println("It purpose to throw exception of I/O!");
   throw new java.io.IOException("That is what I wanna to");
  }
catch(java.io.IOException e){
   System.out.println("Exception:"+e.getMessage());
   }
 }
}