package work;

public abstract class Meat {
    private String meat;
    public void addBeef() {
        meat="牛肉:3.5";
    }
    public void addProk(){
        meat="猪肉:3";
    }

    @Override
    public String toString() {
        return "Meat{" +
                "meat='" + meat + '\'' +
                '}';
    }
}
