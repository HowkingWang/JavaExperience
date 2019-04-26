 class Student{
  int number;
 }
public class ExamM{
  public static void main(String agrs[]){
  Student stu[] = new Student[12];
  for(int i=0;i<stu.length;i++){
    stu[i] = new Student();
    stu[i].number = 122+i;
   }
  for(int i=0;i<stu.length;i++){
   System.out.println("Student address£º"+stu[i]);
   System.out.println(stu[i].number);
    }
   }
}
  