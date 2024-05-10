public class Monkey extends Animal {
    public Monkey(String name, ZooType zooType) {
        super(name, "fruit", 5);
    }

    @Override
    public String getEnclosure() {
        return "Monkey Cage";
    }

    @Override
    public String getCageType() {
        return "";
    }
}
