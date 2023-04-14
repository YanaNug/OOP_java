package OOP_java.HW_4;

public class LightShield implements Shield, Random {


    @Override
    public int protection() {
        return rand.nextInt(6);
    }

    @Override
    public int weight() {
        return 0;
    }
}
