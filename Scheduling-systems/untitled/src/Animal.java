public abstract class Animal {
    public Object food;
    protected String name;
    protected String foodType;
    protected int foodAmountPerMeal;

    public Animal(String name, String foodType, int foodAmountPerMeal) {
        this.name = name;
        this.foodType = foodType;
        this.foodAmountPerMeal = foodAmountPerMeal;
    }

    public abstract String getEnclosure();

    public abstract String getCageType();

    public String getName() {
        return name;
    }

    public int getFoodAmountPerMeal() {
        return foodAmountPerMeal;
    }

    public Object getFood() {
        return food;
    }
}