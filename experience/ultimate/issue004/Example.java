import java.util.Scanner;
public class Example{
  public static void main (String args[]){
   Scanner reader = new Scanner(System.in);
   System.out.println("输入n");
   int n = reader.nextInt();
   double sum = 0,item = 1;
   int i = 1;
   do{
        sum = item+sum;
        i++;
       item = 1/i;
       }while(n<=n)
    
         
    System.out.println(" do-while sum=  "+sum);
    for(i=1,sum=0,item=1;i<=n;i++){
      item=item*(1.0/i);
      sum=sum+item;
         }
     System.out.println(" for循环下的sum=  "+sum); 
   }
}



   
