public class mainClass{ 
  public static void main(String args[]){
   student li = new student();
   li.number = 201012;
   li.age = 18;
   li.height = 1.75;
   li.showPeople();
   li.tellNumber();
 System.out.println("li can calculate add:"+li.add(12,87));
  univerStudent Liu = new univerStudent();
  Liu.age = 21;
  Liu.height = 1.80;
  Liu.number = 211017;
  Liu.showPeople();
  Liu.tellNumber();
System.out.println("Liu同学会做乘法："+Liu.multi(212,97));
  }
}