import java.util.Scanner;
import nhlstats.NHLStatistics;

// Exercise 13: NHL statistics, part 1
public class Mainprogram {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        // Print the top ten players based on goals
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        // Print the top 25 players based on penalty amounts
        System.out.println("Top 25 by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        //  Statistics of New York Rangers
        NHLStatistics.teamStatistics("NYR");

        // Print the statistics for Philadelphia Flyers (abbreviation: PHI).
        NHLStatistics.teamStatistics("PHI");

        // Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
       