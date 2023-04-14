package OOP_java.HW_4;

public class Sword implements Weapon {

    @Override
    public int demage() {
        return 40;
    }

    @Override
    public String toString() {
        return "Sword{} damage- " + this.demage();
    }
}