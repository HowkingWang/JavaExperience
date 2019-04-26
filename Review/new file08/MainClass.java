public class MainClass{
  public static void main(String [] args){
     StuArray stu[] = new StuArray[100];
      for(int i=0;i<stu.length;i++){
        stu[i] = new StuArray();
        stu[i].number = 1+i;
         
   }
        for(int i=0;i<stu.length;i++){
          System.out.println("Address of stu"+i+":"+stu[i]+",Its Value is"+stu[i].number);
     }
  }
}