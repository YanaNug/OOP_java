package OOP_java.HW_4;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Bob", 89, new Bow(45)))
                .addPersons(new Archer("Robbi", 67, new Bow(34)))
                .addPersons(new Archer("Dobbi", 99, new Bow(27)));
        knights.addPersons(new Knight("Tod", 114, new Sword(), new HeavyShield()))
                .addPersons(new Knight("Sem", 98, new Sword(), new LightShield()));
        System.out.println(knights);
        Knight k1 = new Knight("Tod", 114, new Sword(), new HeavyShield());
        Archer a1 = new Archer("Robbi", 100, new Bow(35));
        Battle b1 = new Battle(k1, a1);
        Warrior w1 = b1.run();
        System.out.println(w1);
        Battle b2 = new Battle(archers.persons.get(1), knights.persons.get(1));
        b2.run();
        TeamBattle tb1 = new TeamBattle(archers, knights);
        tb1.RunTeamBattle();


    }
}