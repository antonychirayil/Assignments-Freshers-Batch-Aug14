package Assignment2;

import java.util.*;
abstract class DessertItem{
                           public abstract int getCost(int nos);
                          }
class Candy extends DessertItem{
                               public int getCost(int nos){
                                      return(nos*60);
                                 }
                               }
                           
class Cookie extends DessertItem{
                               public int getCost(int nos){
                                      return(nos*70);
                                 }
                               }
class IceCream extends DessertItem{
                               public int getCost(int nos){
                                      return(nos*10);
                                 }
                               }
public class q7{
public static void main(String[] args){
DessertItem dessert[]=new DessertItem[3];
Scanner s=new Scanner(System.in);
while(true){
System.out.println("What is your role 1.Owner 2.Customer");
int role=s.nextInt();
if(role==1){
System.out.println("Adding dessert items to the menu");
dessert[0]=new Candy();
dessert[1]=new Cookie();
dessert[2]=new IceCream();
}
if(role==2){
System.out.println("Place your order");
System.out.println("How many candies?");
int candy_count=s.nextInt();
System.out.println("How many cookies?");
int cookie_count=s.nextInt();
System.out.println("How many IceCreams?");
int ice_count=s.nextInt();
int candy_cost=dessert[0].getCost(candy_count);
int cookie_cost=dessert[1].getCost(cookie_count);
int ice_cost=dessert[2].getCost(ice_count);
int total=candy_cost+cookie_cost+ice_cost;
System.out.println("Your order");
System.out.println("You ordered "+candy_count+" Candies. Cost="+candy_cost);
System.out.println("You ordered "+cookie_count+" Cookies. Cost="+cookie_cost);
System.out.println("You ordered "+ice_count+" IceCreams. Cost="+ice_cost);
System.out.println("Your Total Bill Amount="+total);
}
if(role==3)
break;
} // end of infinite loop
} // end of main method
} // end of public class












