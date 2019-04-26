import java.io.*;
public class E {
   public static void main(String args[ ]) {
      File file=new File("E.java");
      File tempFile=new File("temp.txt");
      try{ FileReader  inOne=new FileReader(file);
           BufferedReader inTwo= new BufferedReader(inOne);
           FileWriter  tofile=new FileWriter(tempFile);
           BufferedWriter out= new BufferedWriter(tofile);
           String s=null;
           int i=0;
           s=inTwo.readLine();
           while(s!=null) {
               i++;
               out.write(i+" "+s);
               out.newLine();
               s=inTwo.readLine();
           }
           inOne.close();
           inTwo.close();
           out.flush();
           out.close();
           tofile.close();
      }
      catch(IOException e){}
   }
}
