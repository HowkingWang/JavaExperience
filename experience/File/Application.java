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
  }     //���������ҵ���Ҫ�򿪵��ļ��Ϳ�����
}