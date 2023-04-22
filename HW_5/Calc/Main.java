package OOP_java.HW_5.Calc;

public class Main {
    public static void main(String[] args) {
        CalculateComplex calcCompl1 = new CalculateComplex( 15, 37 );
        calcCompl1.setW( 2.0 );
        calcCompl1.setZ( 3.3 );
        System.out.print( "sum = " + calcCompl1.sum() );
        System.out.println( "diff = " + calcCompl1.diff() );
        System.out.println( "mult = " + calcCompl1.mult() );
        System.out.println( "div = " + calcCompl1.div() );

        CalculateRational calcRation1 = new CalculateRational( 3, 30 );
        System.out.println( "sum = " + calcRation1.sum() );
        System.out.println( "diff = " + calcRation1.diff() );
        System.out.println( "mult = " + calcRation1.mult() );
        System.out.println( "div = " + calcRation1.div() );

        Menu menu = new Menu();
        menu.chooseOperation( calcRation1 );
    }
}
