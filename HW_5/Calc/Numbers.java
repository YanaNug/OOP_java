package OOP_java.HW_5.Calc;

public class Numbers extends ValuesNumber {
    public Numbers(double x, double y) {
        super.x = x;
        super.y = y;
    }

    public Numbers(double x) {
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
        Numbers compNum = (Numbers) obj;
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