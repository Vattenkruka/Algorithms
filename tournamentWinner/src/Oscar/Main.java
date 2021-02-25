package Oscar;
import java.util.*;

public class Main {
    final static int SCORE_FOR_WIN = 3;
    public static void main(String[] args) {
	// write your code here
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        String  test = tournamentWinner(competitions,results);
        System.out.println(test);
    }

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here. For results [homeTeam 1, awayTeam 0]
        String winningTeam = "";
            HashMap<String, Integer> scoreTable = new HashMap<>();
        scoreTable.put(winningTeam,0);

        for (int i = 0 ; i < competitions.size() ; i++){
            ArrayList<String> match = competitions.get(i);
           String winner =  match.get(results.get(i) == 0 ? 1 : 0);

           updateScore(scoreTable,winner);

            if(scoreTable.get(winner) > scoreTable.get(winningTeam)){
                winningTeam = winner;
            }

        }

        return winningTeam;
    }
    public static void updateScore(Map<String, Integer> scoreTable, String winner){
        if (scoreTable.containsKey(winner)) {
            scoreTable.put(winner,scoreTable.get(winner)+SCORE_FOR_WIN);
        }
        else{
            scoreTable.put(winner,SCORE_FOR_WIN);
        }
    }

}


