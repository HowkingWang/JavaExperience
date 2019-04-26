public class Block{
 String name;
 int number;
 boolean boo = false;
 public void setName(String name){
    this.name = name;
   }
 public void setNumber(int n){
     number = n;
   }
 public String getName(){
     return name;
   }
 public int getNumber(){
    return number;
   }
 public void setIsMine(boolean boo){
    this.boo = boo;
   }
 boolean isMine(){
     return boo;
   }
}  
