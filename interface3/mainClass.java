public class mainClass{
 public static void main(String [] args){
  Message ms;
   ms = new Car();//ms里存储了Car实例的引用
   ms.kind();
   ms = new TV();
   ms.kind();
  }
} 