public class mainClass{
  public static void main(String [] args){
    Employee[] employee = new Employee[15];
    for(int i=0;i<employee.length;i++){
    if(i<=5)
      employee[i] = new weekWorkers();
     else if(5<i&&i<11)
      employee[i] = new monthWorkers();
      else
      employee[i] = new yearWorkers();
   }
  Company company = new Company(employee);
   System.out.println("Salary of the Company:"+company. salaryPay());
  }
}