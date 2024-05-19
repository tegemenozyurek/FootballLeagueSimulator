import java.util.ArrayList;
import java.util.Random;

public class Match {
    int homeScore;
    int awayScore;

    public void playMatch(Team home, Team away) {
        int positionNumber = 15;

        Random random = new Random(); // Use a single Random object
        League lig = new League();
        ArrayList<Team> teams = new ArrayList<>();
        teams = lig.createNewLeague();

        int[] homeProbs = new int[positionNumber];
        int[] awayProbs = new int[positionNumber];

        for (int i = 0; i < homeProbs.length; i++) {
            homeProbs[i] = random.nextInt(101);
            awayProbs[i] = random.nextInt(101);
        }

        for (int i = 0; i < awayProbs.length; i++) {
            if (homeProbs[i] < home.power) {
                homeScore++;
            }
            if (awayProbs[i] < away.power) {
                awayScore++;
            }
        }

        //Wait 1.5 seconds to print each result
        System.out.println(home.getName() + " " + homeScore + " - " + awayScore + " " + away.getName());

        if (homeScore > awayScore) {
            //Point
            home.setPoint(home.getPoint() + 3);

            //Win-Lose
            home.setWinCount(home.getWinCount() + 1);
            away.setLoseCount(away.getLoseCount() + 1);

            //GF(At)
            home.setGF(home.getGF() + homeScore);
            away.setGF(home.getGF() + awayScore);

            //GA(Ye)
            home.setGA(home.getGA() + awayScore);
            away.setGA(away.getGA() + homeScore);

            //GD(Avaraj)
            home.setGD(home.getGD() + (homeScore-awayScore));
            away.setGD(away.getGD() + (awayScore-homeScore));
        }
        else if (awayScore > homeScore) {
            //Point
            away.setPoint(away.getPoint() + 3);

            //Win-Lose
            away.setWinCount(away.getWinCount() + 1);
            home.setLoseCount(home.getLoseCount() + 1);

            //GF(At)
            home.setGF(home.getGF() + homeScore);
            away.setGF(home.getGF() + awayScore);

            //GA(Ye)
            home.setGA(home.getGA() + awayScore);
            away.setGA(away.getGA() + homeScore);

            //GD(Avaraj)
            home.setGD(home.getGD() + (homeScore-awayScore));
            away.setGD(away.getGD() + (awayScore-homeScore));
        }
        else {
            //Point
            home.setPoint(home.getPoint() + 1);
            away.setPoint(away.getPoint() + 1);

            //Draw
            home.setDrawCount(home.getDrawCount() + 1);
            away.setDrawCount(away.getDrawCount() + 1);

            //GF(At)
            home.setGF(home.getGF() + homeScore);
            away.setGF(home.getGF() + awayScore);

            //GA(Ye)
            home.setGA(home.getGA() + awayScore);
            away.setGA(away.getGA() + homeScore);

            //GD(Avaraj)
            home.setGD(home.getGD() + (homeScore-awayScore));
            away.setGD(away.getGD() + (awayScore-homeScore));
        }


        homeScore = 0;
        awayScore = 0;
    }
}