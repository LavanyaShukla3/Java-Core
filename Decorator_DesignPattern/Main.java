abstract class Coffee {
    public abstract int getCost();
}


class SimpleCoffee extends Coffee {

    @Override
    public int getCost() {
        return 100;
    }
}

abstract class baseDecorator extends Coffee {

    public Coffee coffee;
    public baseDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
class MilkDecorator extends baseDecorator{
    
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 50;
    }

}
class SugarDecorator extends baseDecorator{
    
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
 @Override
    public int getCost() {
        return coffee.getCost() + 40;
    }

}
class CreamDecorator extends baseDecorator{
    

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 40;
    }

}
public class Main {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getCost());

        coffee = new CreamDecorator(coffee);
        System.out.println(coffee.getCost());
    }
}