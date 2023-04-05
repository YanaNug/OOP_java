// import lombok.Getter;
// import lombok.Setter;
import java.util.HashMap;

// @Getter
// @Setter
public class HomeWork {

    private HashMap<Join, Join> tree = new HashMap<>();
    public void append(Person parent, Person children) {
        tree.put(new Join( parent, Relationships.PARENT, children ), new Join( children, Relationships.CHILDREN, parent ));
    }

    @Override
    public String toString() {
        return "GeoTree{" +
                "treeKey=" + tree.keySet() +
                '}';
    }




    public class Join {
        Person p1;
        Relationships re;
        Person p2;
        public Join(Person p1, Relationships re, Person p2) {
            this.p1 = p1;
            this.re = re;
            this.p2 = p2;
        }
    
        @Override
        public String toString() {
            return String.format( "%s %s %s", p1, re, p2 );
        }
    }



    public enum Relationships {
        PARENT("Parents"),
        CHILDREN("Children");
        private String description;
        Relationships(String description) {
            this.description = description;
        }
    }
}

