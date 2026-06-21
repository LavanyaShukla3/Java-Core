class MealBuilder{
    int cost;
    boolean takeOut;
    String mainCourse;
    String drink;   

    MealBuilder addCost(int cost){
        this.cost = cost;
        return this;
    }
    MealBuilder addTakeOut(boolean takeOut){
        this.takeOut = takeOut;
        return this;
    }
    MealBuilder addMainCourse(String mainCourse){
        this.mainCourse = mainCourse;
        return this;
    }
    MealBuilder addDrink(String drink){
        this.drink = drink;
        return this;
    }

    Meal build(){
        return new Meal(this);
    }
}
class Meal{
    int cost;
    boolean takeOut;
    String mainCourse;
    String drink; 

    Meal(MealBuilder builder){
        this.cost = builder.cost;
        this.takeOut = builder.takeOut;
        this.mainCourse = builder.mainCourse;
        this.drink = builder.drink;
    }   

    int getCost(){
        return cost;
    }
    boolean getTakeOut(){
        return takeOut;
    }
    String getMainCourse(){
        return mainCourse;
    }
    String getDrink(){
        return drink;
    } 

}
public  class Main{
    public static void main(String[] args){
        MealBuilder builder = new MealBuilder();
        Meal myMeal = builder.addCost(15)
                     .addTakeOut(true)
                     .addMainCourse("Burger")
                     .addDrink("Coke")
                     .build();


    System.out.println(myMeal.getCost());
    System.out.println(myMeal.getTakeOut());
    System.out.println(myMeal.getMainCourse());
    System.out.println(myMeal.getDrink());
    }
}