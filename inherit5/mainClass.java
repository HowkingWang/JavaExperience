public class mainClass{
  public static void main(String [] args){
  Monkey monkey = new People();//monkey��People����ת�ͱ���
    monkey.crySpeak("LUV"); 
    //super.monkey.add(12,12.0f);
    People people = (People)monkey;
    people.crySpeak("LUV");
    System.out.println("savsaasv"+ people.add(13,12.0f));
    monkey = new Monkey();
    monkey.crySpeak("LUV");
  }
}