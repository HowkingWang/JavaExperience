public class ExamB{
    public static void main(String args[]){
     Rect rect = new Rect();
     rect.width = 12.0f;
     rect.leigth = 13.0f;
     float area = rect.getArea(); 
    System.out.println("Area of Rcte:"+area);
   Lader lader = new Lader();
      lader.above = 10.0f;
      lader.height = 97.12f;
      lader.bottom = 5.0f;
      area = lader.getArea();
     System.out.println("Lader Area:"+area);
 }
}