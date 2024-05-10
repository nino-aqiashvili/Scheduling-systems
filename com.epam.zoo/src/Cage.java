public abstract class Cage {
    protected String name;

    public Cage(String name) {
        this.name = name;
    }

    public abstract String getCageType();
}

