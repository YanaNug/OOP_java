package OOP_java.HW_4;

public class Battle implements Random {
    private Warrior attacker;
    private Warrior definder;
    private int battleField;

    public Battle(Warrior attacker, Warrior definder) {
        this.battleField = rand.nextInt(40, 100);
        System.out.println("Distance - " + this.battleField);
        this.attacker = attacker;
        this.definder = definder;
    }


    private boolean checkDistance(Warrior w) {
        if (w.weapon instanceof Throuwing) {
            return this.battleField <= ((Throuwing) w.weapon).getDistance();
        } else {
            return this.battleField <= 0;
        }
    }

    private int attackMinuShield(Warrior attacker, Warrior definder) {
        int protection = 0;
        int attack = attacker.harm();
        if (definder.shield instanceof Shield) {
            protection = ((Shield) definder.shield).protection();
        }
        if (protection > attack) {
            return 0;
        }
        return attack - protection;
    }

    private String soutW1attackW1(Warrior attacker, Warrior definder, int attack) {
        return String.format("%s %s attack %s %s and give harm %s \n %s %s HP is %d ",
                attacker.getClass(), attacker.getName(), definder.getClass(), definder.getName(), attack, definder.getClass(), definder.getName(), definder.getHp());
    }


    public Warrior run() {
        int attack;
        while (true) {
            if (checkDistance(attacker)) {
                attack = this.attackMinuShield(attacker, definder);
                if (attack == 0) {
                    System.out.println(String.format("%s try to attack, but miss", attacker.getName()));
                } else {
                    definder.reduceHp(attack);

                    System.out.println(soutW1attackW1(attacker, definder, attack));
                    if (!definder.isAlive()) {
                        System.out.println(String.format("Warrior %s is dead, %s is winner", definder.getName(), attacker.getName()));
                        return attacker;
                    }
                }
            } else {
                this.battleField -= attacker.getSpeed();
            }
            if (checkDistance(definder)) {
                attack = this.attackMinuShield(definder, attacker);
                if (attack == 0) {
                    System.out.println(String.format("%s try to attack, but miss", definder.getName()));
                } else {
                    attacker.reduceHp(attack);
                    System.out.println(soutW1attackW1(definder, attacker, attack));
                    if (!attacker.isAlive()) {
                        System.out.println(String.format("Warrior %s is dead, %s is winner", attacker.getName(), definder.getName()));
                        return definder;
                    }
                }
            } else {
                this.battleField -= definder.getSpeed();
            }
        }

    }

}