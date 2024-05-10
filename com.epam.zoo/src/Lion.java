public class Lion extends Animal {
    public Lion(String name, ZooType zooType) {
        super(name, "meat", 12);
    }

    @Override
    public String getEnclosure() {
        return "Lion Cage";
    }

    @Override
    public String getCageType() {
        return "";
    }
}
