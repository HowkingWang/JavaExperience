public class GreekZM{
  public static void main(String args[]){
  char startC = '¦Á';
  char endC = '¦Ø';
 int a = (int) startC;
  int b = (int) endC;
  System.out.println("Ï£À°×ÖÄ¸±í:");
  for(int i = a;i <= b;i++){
   char c ='\0';
   c = (char) i;
   System.out.print(""+c);
   
   }
  //for(int j = i-startC+1;j <= endC;j++){
    //if(j/10==0)
  // System.out.println("");
   }
  System.out.println(""+(int) startC);
  System.out.println(""+(int) endC);
  }
}  