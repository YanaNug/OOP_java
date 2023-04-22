package OOP_java.HW_6.Calc.Mathematic.Numbers;

public class Num extends ValuesNumber {
    public Num(double x, double y) {
        super.x = x;
        super.y = y;
    }

    public Num(double x) {
        super.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Num compNum = (Num) obj;
        return super.x == compNum.x && super.y == compNum.y;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}