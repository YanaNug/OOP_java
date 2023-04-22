package OOP_java.HW_6.Calc.Mathematic.CalculateArea;

import OOP_java.HW_6.Calc.Interface.Calculating;
import OOP_java.HW_6.Calc.Mathematic.Numbers.Num;

public class CalculateRational extends Num implements Calculating<Num> {
    public CalculateRational(double x, double y) {
        super( x, y );
    }

    @Override
    public Num sum() {
        return new Num( x + y );
    }

    @Override
    public Num diff() {
        return new Num( x - y );
    }

    @Override
    public Num mult() {
        return new Num( x * y );
    }

    @Override
    public Num div() {
        return new Num( x / y );
    }

    @Override
    public String toString() {
        return "CalculateRational{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
