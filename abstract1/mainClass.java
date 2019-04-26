public class mainClass{
 public static void main(String [] args){
  PersonalStyle person;
  person = new Women();
  person.style();
  person.elect();
  person = new Men();
  person.style();
  person.elect();
 }//面向抽象编程--使用上转...
}