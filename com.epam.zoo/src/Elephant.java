public class Elephant extends Animal {
    public Elephant(String name, ZooType zooType) {
        super(name, "grass+fruit", 12);
    }

    @Override
    public String getEnclosure() {
        return "Elephant Cage";
    }

    @Override
    public String getCageType() {
        return "";
    }
}
