package Assignment5;

import java.util.HashSet;


  class employee{ int id; String name; String dept; double salary;
  
  public employee(int id, String name, String dept, double salary) { super();
  this.id = id; this.name = name; this.dept = dept; this.salary = salary; }
  
  public double getSalary() { return salary; }
  
  
  } public class Assign5 {
  
  public static void main(String[] args) { HashSet<employee> set=new
  HashSet<>(); employee e1 = new employee(100," Antony"," CSE ", 60000);
  employee e2 = new employee(101," Nihal"," EEE ", 80000); set.add(e1);
  set.add(e2);
  
  for(employee e:set) {
  System.out.println(e.id+""+e.name+""+e.dept+""+e.salary); }
  
  }
  }
  
 