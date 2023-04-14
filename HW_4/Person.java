package OOP_java.HW_4;

public abstract class Person implements Random {
    protected int speed = rand.nextInt(5, 11);
    private String name;
    private int hp;

    public Person(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void reduceHp(int demage) {
        hp -= demage;
        if (hp < 0) {
            hp = 0;
        }
    }


}