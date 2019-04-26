public class MainClass{  
    public static void main(String[] args) {  
     House house = new House();
      Thread dog,cat;
         dog = new Thread(house);
         cat = new Thread(house);
          dog.setName("dog");
          cat.setName("cat");
          dog.start();
          cat.start();
         }
}