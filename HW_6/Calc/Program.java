package OOP_java.HW_6.Calc;

import OOP_java.HW_6.Calc.Mathematic.CalculateArea.CalculateComplex;
import OOP_java.HW_6.Calc.Mathematic.CalculateArea.CalculateRational;
import OOP_java.HW_6.Calc.UI.App;

public class Program {
    public static void main(String[] args) {
        CalculateComplex calcCompl1 = new CalculateComplex( 15, 37 );
        CalculateRational calcRation1 = new CalculateRational( 3, 30 );
        App.ButtonClick(calcCompl1);
    }
}
