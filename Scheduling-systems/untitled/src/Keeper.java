public abstract class Keeper {
    protected String name;

    public Keeper(String name) {
        this.name = name;
    }

    public abstract String getSpecialization();
}

