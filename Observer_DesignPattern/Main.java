import java.util.*;
class Customer{
    String name;
    int notificationCount;

    public Customer(String name){
        this.name = name;
    }
    public int countNotifications() {
        return notificationCount;
    }
    public void update(){
        notificationCount++;
            //return number;
    }
}
class OnlineStoreItem{
    String item;
    int stockCount;
    List<Customer> subscribers = new ArrayList<>();

    public OnlineStoreItem(String item, int stockCount){
        this.item = item;
        this.stockCount = stockCount;
    }
    public void subscribe(Customer c){
        subscribers.add(c);
    }
    public void unsubscribe(Customer c){
        subscribers.remove(c);
    }
    public void update(int newStockCount){
        if(stockCount == 0 && newStockCount>0){
            for(Customer c: subscribers){
                c.update();
            }
        }
        stockCount = newStockCount;
    }
}
public class Main{
    public static void main(String[] args){
        OnlineStoreItem item1 = new OnlineStoreItem("Awesome Gadget", 0);

Customer customer1 = new Customer("John Doe");
Customer customer2 = new Customer("Jane Doe");

item1.subscribe(customer1);
item1.subscribe(customer2);
item1.update(5); // customer1 and customer2 are notified

item1.unsubscribe(customer1);

item1.update(0); // No one is notified
item1.update(3); // Only customer2 is notified this time
item1.update(2); // No one is notified

System.out.println(customer1.countNotifications()); // 1
System.out.println(customer2.countNotifications()); // 2
    }
}
