package OOP_java.HW_4;

public class Knight extends Warrior<Sword, Shield> {
    private int speed;

    public Knight(String name, int hp, Sword weapon, Shield shield) {
        super(name, hp, weapon, shield);
        this.speed = rand.nextInt(5, 11) - shield.weight();
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Knight{}" + super.toString() + " speed "
                + this.getSpeed() + String.format(" with %s protection %d", shield.getClass(), shield.protection());
    }
}