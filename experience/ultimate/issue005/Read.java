import java.io.*;  
public class Read{  
    public static void main(String[] args) {  
        try{FileInputStream f=new FileInputStream("english.txt");  
        byte[] bb=new byte[100];  
        int n=f.read(bb);  
        char[] c=new String(bb,0,n).toCharArray();  
        //System.out.println(c);  
        for(int i=c.length-1;i>=0;i--)  
            System.out.print(c[i]);  
        }catch(Exception e){  
              
        }  
      
    }  
}  
 /*  import java.io.*;  
public class ReadMain {  
    public static void main(String[] args) {  
        try{
             FileInputStream f=new FileInputStream("text.txt");  
             byte b[]=new byte[1000000];//定义数组 
            int n=f.read(b);  
            char c[]=new String(b,0,n).toCharArray(); //字符数组 
   
        for(int i=c.length-1;i>=0;i--) 
            System.out.print(c[i]);  
        }catch(Exception e){  
              
        }  
      
    }  
}  */