package Assignment2;

import java.util.*;

abstract class Shape{
                     public abstract void draw();
                    }
class Line extends Shape{
                          public void draw(){
                             System.out.println("Line is drawn");
                            }
                         }
class Rectangle extends Shape{
                          public void draw(){
                             System.out.println("Rectangle is drawn");
                            }
                         }
class Cube extends Shape{
                          public void draw(){
                             System.out.println("Cube is drawn");
                            }
                         }
public class q5{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
Shape x=null;
System.out.println("Which shape do you want? 1.Line 2.Rectangle 3.Cube");
int c=s.nextInt();
if(c==1)
x=new Line();
else if(c==2)
x=new Rectangle();
else if(c==3)
x=new Cube();
else{
System.out.println("Invalid choice");
System.exit(0);
}
if(x!=null)
x.draw();
}
}