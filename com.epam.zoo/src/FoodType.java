public enum FoodType {
    FRUIT("Fruit"),
    GRASS("Grass"),
    MEAT("Meat"),

    private final String name;
   FoodType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}