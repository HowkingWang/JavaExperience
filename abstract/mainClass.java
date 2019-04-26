public class mainClass{
 public static void main(String [] args){
  pillar zhuti;
  geometry bottom;
  bottom = new rectangle(12.0,25.0);
  zhuti = new pillar(bottom,98);
  System.out.println("Voluem of pillar"+zhuti.getVolume());
  bottom = new circle(98);
  zhuti = new pillar(bottom,98);
 System.out.println("Voluem of pillar"+zhuti.getVolume());
 }
}