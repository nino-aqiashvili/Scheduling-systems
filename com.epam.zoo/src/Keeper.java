abstract class Keeper {

    private String name;
    public Keeper(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract String getSpecialization();
}