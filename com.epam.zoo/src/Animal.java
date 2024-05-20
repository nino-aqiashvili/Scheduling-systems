import java.time.LocalTime;
import java.util.*;
public abstract class Animal {
    private String name;
    private FoodType foodType;
    private int foodAmountPerMeal;

    public Animal(String name, FoodType foodType, int foodAmountPerMeal) {
        this.name = name;
        this.foodType = foodType;
        this.foodAmountPerMeal = foodAmountPerMeal;
    }
    public abstract Enclosure getEnclosure();
    public String getName() {
        return name;
    }
    public int getFoodAmountPerMeal() {
        return foodAmountPerMeal;
    }
    public FoodType getFoodType() {return foodType;}
    public static void (String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Meat");
        food.add("Grass");
        food.add("Fruit");
    }
}