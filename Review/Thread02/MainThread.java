public class MainThread{
  public static void main(String [] args){
     Animal animal = new Animal();
        animal.setWater(20);
        Thread dog,cat;
         dog = new Thread(animal);
         cat = new Thread(animal);
         dog.setName("Dog");
         cat.setName("Cat");
         dog.start();
         cat.start();
        }
}