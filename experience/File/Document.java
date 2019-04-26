import java.io.*;
public class Document{
   public static void main(String args[]){
       File f = new File("C:\\Users\\wanghao\\Desktop\\experience","Home.txt");
    System.out.println(f.getName()+"Length of file:"+f.length());
    System.out.println(f.getName()+"Reade?:"+f.canRead());
    System.out.println(f.getName()+"Write?:"+f.canWrite()); 
    System.out.println(f.getName()+"AbsolutePath:"+f.getAbsolutePath());
    System.out.println(f.getName()+"Hide?:"+f.isHidden());
    System.out.println(f.getName()+"LastModifiedTime:"+f.lastModified());
      File files = new File("new File");
    System.out.println("The present file in the directory:"+f.getName());
         if(!files.exists()){
             try{
                files.createNewFile();
         System.out.println("Success");
    }
   catch(IOException exp){}
       }
     }
}