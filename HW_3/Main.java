package OOP_java.HW_3;

public class Main {

        public static void main(String[] args) {
            Men om1 = new Men( "Vadim", 30 );
            Children oc1 = new Children( "Lina", 3 );
            Cat c1 = new Cat( "Kisa", 4 );
            Dog d1 = new Dog( "Jeki", 8 );
    
            om1.meeting( oc1 );
            oc1.meeting( om1 );
            d1.meeting( d1 );
            d1.meeting( c1 );
            om1.meeting( d1 );
            d1.meeting( om1 );
        
    }   
}
