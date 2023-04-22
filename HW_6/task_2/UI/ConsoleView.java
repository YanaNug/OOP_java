package OOP_java.HW_6.task_2.UI;

import OOP_java.HW_6.task_2.Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner in;

    public ConsoleView() {
        in = new Scanner( System.in );
    }

    @Override
    public String getFirstName() {
        System.out.print( "FirstName: " );
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf( "FirstName: %s\n", value );
    }

    @Override
    public String getLastName() {
        System.out.print( "LastName: " );
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf( "LastName: %s\n", value );
    }

    @Override
    public String getPhone() {
        System.out.print( "Phone: " );
        return in.nextLine();
    }

    @Override
    public void setPhone(String value) {
        System.out.printf( "Phone: %s\n", value );
    }
}