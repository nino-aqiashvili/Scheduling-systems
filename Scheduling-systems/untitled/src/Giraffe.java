public class Giraffe extends Animal {
    public <ZooType> Giraffe(String name, ZooType zooType) {
        super(name, "grass", 10);
    }

    @Override
    public String getEnclosure() {
        return "Giraffe Cage";
    }

    @Override
    public String getCageType() {
        return "";
    }
}
