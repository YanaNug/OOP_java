import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class Person {
    private String firstName;
    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format( "%s", firstName );
    }


    public class Program {
        public static void main(String[] args) throws Exception {
            var vadim = new Person("Vadim", 30);
            var yana = new Person("Yana", 27);
            var adelina = new Person("Adelina", 3);
            var igor = new Person("Igor", 5);
            var jenya = new Person("Jenya", 32);
            
    
            HomeWork gt = new HomeWork();
            gt.append(vadim, yana);
            gt.append(yana, adelina);
            gt.append(yana, igor);
            gt.append(vadim, jenya);
            gt.append( adelina, igor );
    
            System.out.println(new Research( gt ).findChildren(yana));
            System.out.println(new Research( gt ).findParent(adelina));
    
            Printer p1 = new Printer();
            p1.print("Print in console with class Printer -> " + new Research( gt ).findParent( adelina ) );
            p1.saveFile(  new Research( gt ).findChildren( igor));
        }
    }


    public class Printer {
        void print(String inputString) {
            System.out.println(inputString);
        }
    
        void saveFile(String inputString) {
    
            try {
                String pathProject = System.getProperty("user.dir");
                String pathFile = pathProject.concat("/file_relationships.txt");
                File file = new File(pathFile);
    
                if (file.createNewFile()) {
                    System.out.println("\nfile.created");
                    FileWriter fileWriter = new FileWriter(file, true);
                    fileWriter.write(inputString);
                    fileWriter.flush();
                    fileWriter.close();
                } else {
                    System.out.println("\nfile.existed");
                }
            } catch (Exception e) {
                e.getMessage();
            } finally {
                System.out.println(inputString);
            }
        }
    }





    
    public class Research {
        HashMap<Link, Link> tree;
        public Research(HomeWork geoTree) {
            tree = geoTree.getTree();
        }
        public String findChildren(Person person) {
            StringBuilder result = new StringBuilder();
            for (Link t : tree.keySet()) {
                if (t.p1.getFirstName() == person.getFirstName()) {
                    result.append( t.p2 ).append( " " );
                }
            }
            return String.format( "Children %s : %s", person, result );
        }
        public String  findParent(Person person) {
            StringBuilder result = new StringBuilder();
            for (Link t : tree.values()) {
                if (t.p1.getFirstName() == person.getFirstName()) {
                    result.append( t.p2 ).append( " " );
                }
            }
            return String.format( "Parent %s : %s", person, result );
        }
    }
}
