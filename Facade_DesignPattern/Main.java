//Order, Cashier, Food, Chef, PackagedFood, KitchenStaff

class Order{
    String item;
    boolean takeOut;
    public Order(String item, boolean takeOut){
        this.item = item;
        this.takeOut = takeOut;
    }
    public String getItem() {
        return item;
    }
    public boolean isTakeOut() {
        return takeOut;
    }
    public void setItem(String item){
        this.item = item;
    }
    public void settakeOut(boolean takeout){
        this.takeOut = takeout;
    }

}
class Cashier {

    public Order takeOrder(String item, boolean takeOut) {
        return new Order(item, takeOut);
    }
}

class Food {

    private String item;

    public Food(String item) {
        this.item = item;
    }

    public String getFood() {
        return item;
    }
}
class Chef {

    public Food prepareFood(Order order) {
        return new Food(order.getItem());
    }
}
class PackagedFood extends Food{
    public PackagedFood(String item){
        super(item + " in a bag");
    }
}
class KitchenStaff {

    public PackagedFood packageFood(Food food) {
        return new PackagedFood(food.getFood());
    }
}
class DriveThruFacade{
    Order order;
    Cashier cashier;
    Food food;
    Chef chef;
    PackagedFood packagedfood;
    KitchenStaff kitchenStaff;

    public DriveThruFacade() {
        cashier = new Cashier();
        chef = new Chef();
        kitchenStaff = new KitchenStaff();
    }
    public Food takeOrder(String item, boolean takeOut) {

        Order order = cashier.takeOrder(item, takeOut);
        Food food = chef.prepareFood(order);
        if (takeOut) {
            return kitchenStaff.packageFood(food);
        }

        return food;
    }
}
class Main{
    public static void main(String[] args){
        DriveThruFacade driveThru = new DriveThruFacade();

        Food dineInFood = driveThru.takeOrder("Burger and Fries", /* takeOut= */ false);
        System.out.println(dineInFood.getFood()); // "Burger and Fries"

        Food takeOutFood = driveThru.takeOrder("Pizza", /* takeOut= */ true);
        System.out.println(takeOutFood.getFood()); // "Pizza in a bag"
    }
}