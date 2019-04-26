import java.io.*;
public class Application{
 public static void main(String [] args){
     try{
          Runtime run = Runtime.getRuntime();
          File file = new File("D:\\CloudMusic","cloudmusic.exe");
     run.exec(file.getAbsolutePath());
     }
        catch(Exception e){
           System.out.println(e);
    }
  }     //声明对象，找到需要打开的文件就可以啦
}