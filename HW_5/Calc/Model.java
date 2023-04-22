package OOP_java.HW_5.Calc;

import java.io.File;
import java.io.FileWriter;

public class Model {
    public void saveFile(String inputString) {

        try {
            String pathProject = System.getProperty( "user.dir" );
            String pathFile = pathProject.concat( "/log_calculation.txt" );
            File file = new File( pathFile );

            if (file.createNewFile()) {
                System.out.println( "\nfile.created" );
                FileWriter fileWriter = new FileWriter( file, true );
                fileWriter.write( inputString );
                fileWriter.flush();
                fileWriter.close();
            } else {
                System.out.println( "\nfile.existed" );
                FileWriter fileWriter = new FileWriter( file, true );
                fileWriter.write( inputString );
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println( inputString );
        }
    }
}