package OOP_java.HW_3;

public class Children extends Owner implements Communication{
    public Children(String name, int age) {
        super( name, age );
    }

    @Override
    public void meeting(Animals animal) {
                if (animal instanceof Cat) {
            System.out.println( "Phhhhhh phhhhh" );
        } else if (animal instanceof Dog) {
            System.out.println( "RRRRRR RRRRR" );
        }
    }

    @Override
    public void meeting(Person person) {
        if (person instanceof Men) {
            System.out.println("-Hi dad");
        }
    }
}