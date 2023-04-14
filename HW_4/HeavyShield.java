package OOP_java.HW_4;

public class HeavyShield implements Shield, Random {

    @Override
    public int protection() {
        return rand.nextInt(5, 11);
    }

    @Override
    public int weight() {
        return rand.nextInt(1, 3);
    }
}