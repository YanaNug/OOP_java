package OOP_java.HW_4;

public class TeamBattle<T extends Person> {
    private Team<Warrior> attakers;
    private Team<Warrior> deffenders;

    public TeamBattle(Team<Warrior> attakers, Team<Warrior> deffenders) {
        this.attakers = attakers;
        this.deffenders = deffenders;
    }


    public Team<Warrior> RunTeamBattle() {
        if (attakers.persons.isEmpty() || deffenders.persons.isEmpty()) {
            System.out.println("Error, one of the team is empty");
            return null;
        }
        while (true) {
            Warrior attacker = attakers.persons.get(0);
            Warrior deffender = deffenders.persons.get(0);
            Battle b1 = new Battle(attacker, deffender);
            Warrior winner = b1.run();
            if (winner == attacker) {
                deffenders.persons.remove(deffender);
            } else {
                attakers.persons.remove(attacker);
            }
            if (deffenders.persons.isEmpty()) {
                System.out.println(String.format(" Team %s win.", attakers.toString()));
                return attakers;
            }
            if (attakers.persons.isEmpty()) {
                System.out.println(String.format(" Team %s win.", deffenders.toString()));
                return deffenders;
            }
        }

    }
}