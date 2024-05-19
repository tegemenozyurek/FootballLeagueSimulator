import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortAndDisplayTable {

    League l = new League();

    public ArrayList<Team> sortedLeague() {
        ArrayList<Team> playedLeague = l.playLeague();

        // Sort the playedLeague by points in descending order
        Collections.sort(playedLeague, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2) {
                return Integer.compare(t2.getPoint(), t1.getPoint());
            }
        });

        return playedLeague;
    }

    public static void main(String[] args) {
        SortAndDisplayTable s = new SortAndDisplayTable();
        ArrayList<Team> sortedTeams = s.sortedLeague();

        // Ensure not to exceed the number of teams in the list
        int numberOfTeamsToDisplay = Math.min(20, sortedTeams.size());
        for (int i = 0; i < numberOfTeamsToDisplay; i++) {
            System.out.println((i+1) + ". " + sortedTeams.get(i));
        }
    }
}
