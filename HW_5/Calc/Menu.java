package OOP_java.HW_5.Calc;

import java.util.Scanner;

public class Menu {
    public void chooseOperation(Numbers num) {
        try (Scanner in = new Scanner( System.in )) {
            System.out.println( " 1 - sum  2 - diff 3 - mult 4 - div" );
            String key = in.next();
            System.out.print( "\033[H\033[J" );
            Numbers result = new Numbers( 0 );
            Model log = new Model();
            log.saveFile( "Input " + num.toString() );
            switch (key) {
                case "1" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).sum();
                    } else {
                        result = ((CalculateRational) num).sum();
                    }
                }
                case "2" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).diff();
                    } else {
                        result = ((CalculateRational) num).diff();
                    }
                }
                case "3" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).mult();
                    } else {
                        result = ((CalculateRational) num).mult();
                    }
                }
                case "4" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).div();
                    } else {
                        result = ((CalculateRational) num).div();
                    }
                }
                default -> {
                    System.out.println( "Такой команды нет" );
                }
            }
            log.saveFile( " Result " + result.toString() + "\n" );
        }
    }
}