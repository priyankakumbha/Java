class Employee
{
  void work()
  {
    System.out.println("employee work");
  }
}
class SoftwareEmployee extends Employee
{
 void work()
 {
   System.out.println("SoftwareEmployee work");
 }
}
class HrEmployee extends Employee
{
 void work()
 {
   System.out.println("HrEmployee work");
 }
}
class SalesEmployee extends Employee
{
 void work()
 {
   System.out.println("SalesEmployee work");
 }
}

class M40
{
  public static void main(String[] args)
  {
    Employee[] employees = new Employee[3];
    employees[0] = new SoftwareEmployee();
    employees[1] = new HrEmployee();
    employees[2] = new SalesEmployee();
    for(Employee employee : employees)
{
  employee.work();s
}


  }
}
