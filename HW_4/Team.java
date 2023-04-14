package OOP_java.HW_4;

public class Team<T extends Person> implements Iterable<T> {
    ArrayList<T> persons = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }

    public Team<T> addPersons(T person) {
        persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                "persons=" + persons +
                '}';
    }

    public int maxRange() {
        int max = 0;
        for (T t : this
        ) {
            if (t instanceof Archer) {
                Archer archer = (Archer) t;
                if (archer.getRange() > max) {
                    max = archer.getRange();
                }
            }

        }
        return max;
    }
}