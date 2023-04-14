package OOP_java.HW_4;

public abstract class Throuwing implements Weapon {
    private int distance;

    public Throuwing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Throuwing{" + "demage" + demage() +
                "distance=" + distance +
                '}';
    }


}