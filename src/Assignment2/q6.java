package Assignment2;

import java.util.Scanner;
abstract class Persistence{
                            public abstract void persist();
                          }
class FilePersistence extends Persistence{
                        public void persist(){
                               System.out.println("Data is being written in a File");
                          }
                       }
class DatabasePersistence extends Persistence{
                        public void persist(){
                           System.out.println("Data is being written in a Database");
                         }
                        }
public class q6{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Persistence x;
System.out.println("Whcich one do you prefer? 1. File 2.Database");
int choice=s.nextInt();
if(choice==1)
x=new FilePersistence();
else
x=new DatabasePersistence();
x.persist();
}
}

