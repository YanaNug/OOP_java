package OOP_java.HW_4;

public class Bow extends Throuwing {
    private String name;

    public Bow(int distance) {
        super(distance);
        this.name = "Bow";
    }

    @Override
    public int demage() {
        return 30;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "name='" + name + '\'' +
                super.toString() +
                '}';
    }
}