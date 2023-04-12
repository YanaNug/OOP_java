package OOP_java.HW_3;

public class Dog extends Animals implements Communication {
    public Dog(String nickname, int age) {
        super( nickname, age );
    }

    @Override
    public void meeting(Animals animal) {
        if (animal instanceof Dog) {
            System.out.println("bark");
        } else if (animal instanceof Cat) {
            System.out.println("hisses");
        }
    }

    @Override
    public void meeting(Person person) {
        if (person instanceof Men) {
            System.out.println("Wag your tail");
        } else if (person instanceof Children) {
            System.out.println("Wag the tail");
        }
    }
}