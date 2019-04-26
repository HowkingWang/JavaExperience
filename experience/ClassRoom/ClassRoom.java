public class ClassRoom implements Runnable{
    Thread teacher,student;
     ClassRoom(){
          teacher = new Thread(this);
          student = new Thread(this);
          teacher.setName("Teacher");
          student.setName("Student");
      }
    public void run(){
           if(Thread.currentThread()==student){
               try{  System.out.println(student.getName()+"is sleeping");
                      Thread.sleep(1000*10*60);
             }
             catch(InterruptedException e){
               
                System.out.println(student.getName()+"is wacked up");
               }
                 System.out.println("It's time for"+student.getName()+" to have class");
           }
             else if(Thread.currentThread()==teacher){
                         for(int i=0;i<2;i++){
                System.out.println("Have class");                    
                  try{Thread.sleep(1000);
           }
            catch(InterruptedException e){}
             }
            student.interrupt();
               
       }
  }
} 