package OOP_java.HW_4;

public class Archer extends Warrior<Throuwing, NoShield> {
    public Archer(String name, int hp, Throuwing weapon) {
        super(name, hp, weapon, new NoShield());
    }

    public int getRange() {
        return rand.nextInt(weapon.getDistance() + 1);
    }


    @Override
    public String toString() {
        return "Archer{}" + super.toString();
    }
}