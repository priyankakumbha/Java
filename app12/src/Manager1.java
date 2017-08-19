class Job
{
  String title;
  double salary;
  Job(String title, double salary)
  {
    this.title = title;
    this.salary = salary;
  }
}
class Employee
{
  private int index;
  Job[] jobs;
  Employee(Job[] jobs)
  {
    this.jobs = jobs;
  }
  boolean hasNext()
  {
    return index < jobs.length;
  }
  Job nextJob()
  {
    return jobs[index++];
  }
}
class Manager1
{
  public static void main(String[] args)
  {
    Job j1 = new Job("software", 50000);
    Job j2 = new Job("hardware" , 25000);
    Job j3 = new Job("hr", 20000);
    Job j4 = new Job("sales", 10000);
    Job[] jobs ={j1, j2, j3, j4};
    Employee emp = new Employee(jobs);
    Job job = null;
    while(emp.hasNext())
    {
      job = emp.nextJob();
      System.out.println(job.title + ";" + job.salary);
    }
    System.out.println("--------------");
    while(emp.hasNext())
    {
      job = emp.nextJob();
      System.out.println(job.title + ";" + job.salary);
    }
    System.out.println("--------------");
  }
}
