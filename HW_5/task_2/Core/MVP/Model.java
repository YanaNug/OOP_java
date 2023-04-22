package OOP_java.HW_5.task_2.Core.MVP;

import OOP_java.HW_5.task_2.Core.Models.Contact;
import OOP_java.HW_5.task_2.Core.Infrastructure.Phonebook;

import java.io.*;

public class Model {
    Phonebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getCotact( currentIndex );
        } else {
            return null;
        }
    }

    public void load() {
        try {
            File file = new File( path );
            FileReader fr = new FileReader( file );
            BufferedReader reader = new BufferedReader( fr );
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String phone = reader.readLine();
                this.currentBook.add( new Contact( fname, lname, phone ) );
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter( path, false )) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact( i );
                writer.append( String.format( "%s\n", contact.firstName ) );
                writer.append( String.format( "%s\n", contact.lastName ) );
                writer.append( String.format( "%s\n", contact.phone ) );
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println( ex.getMessage() );
        }
    }

    public void saveAnother() {
        try (FileWriter writer = new FileWriter( path, false )) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact( i );
                writer.append( String.format( "%s \n", contact.firstName ) );
                writer.append( String.format( "%s \n", contact.lastName ) );
                writer.append( String.format( "%s \n", contact.phone ) );
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println( ex.getMessage() );
        }
    }

    public Phonebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}