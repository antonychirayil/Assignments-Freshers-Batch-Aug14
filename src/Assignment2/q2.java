package Assignment2;

abstract class Employee{
    int empid;
    String name;
    double base_sal;
    double salary;
    public Employee(int id,String n,double basic){
       this.empid=id;
       this.name=n;
       this.base_sal=basic;
       this.salary=0;
     }
    public void display(){
       System.out.println("Emp Id: "+this.empid);
       System.out.println("Emp Name: "+this.name);
       System.out.println("Total Salary: "+this.salary);
    }
   public abstract void calculate_salary();
 }
class Manager extends Employee{
                    double incentive;
                    public Manager(int id,String n,double basic){
                    super(id,n,basic);
                    }
                    public void giveIncentive(double inc){
                      this.incentive=inc;
                     }
                    public void calculate_salary(){
                      salary=base_sal+incentive;
                     }
               }
class Labour extends Employee{
                  int overtime;
                  public Labour(int id,String n,double basic){
                    super(id,n,basic);
                    }
                  public void assignOvertime(int time){
                       overtime=time;
                  }
                  public void calculate_salary(){
                      salary=base_sal+overtime*100;
                   }
                 }
public class q2{
public static void main(String[] args){
Manager x=new Manager(101,"Arun",10000.0);
x.giveIncentive(5000.0);
x.calculate_salary();
x.display();
Labour y=new Labour(102,"Raju",2000.0);
y.assignOvertime(10);
y.calculate_salary();
y.display();
}
}