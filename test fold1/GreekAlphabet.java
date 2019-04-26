public class GreekAlphabet {
 public static void main(String args[]) {
  int startPosition = 0, endPosition = 0;
  char cSrart = '¦Á', cEnd = '¦Ø';
  startPosition = (int) cSrart;
  endPosition = (int) cEnd;
  System.out.println("Ï£À°×ÖÄ¸±í£º");
  System.out.println("Ð¡Ð´£º");
  for (int i = startPosition; i <= endPosition; i++) {
   char c = '\0';
   c = (char) i;
   System.out.print(" " + c);
   if ((i - startPosition + 1) % 10 == 0) {
    System.out.println("");
   }
  }

  System.out.println();
  cSrart = '¦¡';
  cEnd = '¦¸';
  startPosition = (int) cSrart;
  endPosition = (int) cEnd;
  System.out.println("´óÐ´£º");
  for (int i = startPosition; i <= endPosition; i++) {
   char c = '\0';
   c = (char) i;
   System.out.print(" " + c);
   if ((i - startPosition + 1) % 10 == 0) {
    System.out.println("");
   }
  }
 }
}