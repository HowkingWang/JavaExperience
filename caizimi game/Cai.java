import java.util.*;
public class Cai{
 public static void main(String [] args){
  int number=(int)(Math.random()*100)+1; 
  System.out.println("������һ��100���ڵ�����");
  Scanner reader = new Scanner(System.in);
  int i = reader.nextInt();
  if(i==number){
  System.out.println("��ϲ����¶���");
    }
 else
 System.out.println("���ź����´���@@");
  }
}
 