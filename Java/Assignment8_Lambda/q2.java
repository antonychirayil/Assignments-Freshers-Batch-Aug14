package Assignment8_Lambda;

class Orders{

    int orderid;
    int orderPrice;
    String status;

    public Orders(int orderid, int orderPrice, String status) {
        this.orderid = orderid;
        this.orderPrice = orderPrice;
        this.status = status;
    }
    public void display(){
        System.out.println("Orderid:"+this.orderid+"  Price: "+this.orderPrice+"  Status: "+this.status);
    }
}

interface checking{
    public void check(Orders obj);
}
public class q2 {
    public static void main(String[] args) {
        Orders order1 = new Orders(101,15000,"Accepted");
        Orders order2 = new Orders(108,21500,"Completed");
        Orders order3 = new Orders(106,7500,"Accepted");
              //displaying items according to the criteria specified 
        checking d = (Orders obj)->{
          if (obj.orderPrice>10000&&(obj.status.equalsIgnoreCase("completed")||obj.status.equalsIgnoreCase("Accepted")))
              obj.display();
        };

        d.check(order1);
        d.check(order2);
        d.check(order3);
    }
    }