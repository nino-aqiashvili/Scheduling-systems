public class Crocodile extends Animal {
    public Crocodile(String name, ZooType zooType) {
        super(name, "meat", 18);
    }

    @Override
    public String getEnclosure() {
        return "Crocodile Pool";
    }

    @Override
    public String getCageType() {
        return "";
    }
}
