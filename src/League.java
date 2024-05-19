import java.util.ArrayList;

public class League {

    public ArrayList<Team> createNewLeague() {
        ArrayList<Team> superLig = new ArrayList<>();

        superLig.add(new Team("Galatasaray", 10));
        superLig.add(new Team("Fenerbahçe", 9));
        superLig.add(new Team("Beşiktaş", 8));
        superLig.add(new Team("Trabzonspor", 7));
        superLig.add(new Team("Başakşehir", 6));
        superLig.add(new Team("Kayserispor", 4));
        superLig.add(new Team("Antalyaspor", 5));
        superLig.add(new Team("Gaziantep FK", 3));
        superLig.add(new Team("Sivasspor", 5));
        superLig.add(new Team("Alanyaspor", 6));
        superLig.add(new Team("Hatayspor", 3));
        superLig.add(new Team("Konyaspor", 4));
        superLig.add(new Team("Göztepe", 4));
        superLig.add(new Team("Samsunspor", 5));
        superLig.add(new Team("İstanbulspor", 5));
        superLig.add(new Team("Fatih Karagümrük", 4));
        superLig.add(new Team("Adana Demirspor", 6));
        superLig.add(new Team("Çaykur Rizespor", 3));
        superLig.add(new Team("Kasımpaşa", 3));
        superLig.add(new Team("MKE Ankaragücü", 4));

        return superLig;
    }

    public ArrayList<Team> playLeague() {
        League lig = new League();
        Fixture newFixture = new Fixture(20);
        Match play = new Match();

        int[] homeTeam;
        int[] awayTeam;

        homeTeam = newFixture.homeIndex;
        awayTeam = newFixture.awayIndex;
        ArrayList<Team> superLig = lig.createNewLeague();

        // Play matches
        for (int i = 0; i < 380; i++) {
            play.playMatch(superLig.get(homeTeam[i]), superLig.get(awayTeam[i]));
            waitSeconds(0.3); // Wait
        }

        return superLig;
    }

    private void waitSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
