public class Company{
  double salaries = 0;
  Employee[] employee;
  
  Company(Employee[] employee){
  this.employee = employee;
  }
  public double salaryPay(){
   for(int i = 0;i<employee.length;i++){
      salaries = salaries+employee[i].earing();
   }
   return salaries;
 }
}
   
  