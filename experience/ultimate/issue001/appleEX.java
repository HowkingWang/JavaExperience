class apple{
    static int totalNumber;
    static float totalWeight;
     float weight;
     apple(float w){
           weight = w;
           totalNumber++;
           totalWeight=totalWeight+weight;
        }
     public void sale(){
         totalNumber--;
         totalWeight--;
    }
  }
public class appleEX{
  public static void main(String [] args){
      apple ap1,ap2;
      ap1 = new apple(20);
      ap2 = new apple(15);
       System.out.println("Total number of apple:"+apple.totalNumber);
       System.out.println("Total Weight of apple:"+ap1.totalWeight);
         ap1.sale();
       System.out.println("Total number of apple:"+apple.totalNumber);
       System.out.println("Total Weight of apple:"+apple.totalWeight);
         ap2.sale();
       System.out.println("Total number of apple:"+apple.totalNumber);
       System.out.println("Total Weight of apple:"+apple.totalWeight);
    }
}
         