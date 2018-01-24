package example.codeclan.com.rps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by user on 24/01/2018.
 */

public class Game {

    private ArrayList<String> answers;

    public Game() {
        answers = new ArrayList<>();
        answers.add("Scissors");
        answers.add("Rock");
        answers.add("Paper");
    }


    public String getRandomAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public String getResult(String pC, String cC) {
//        String cC = getRandomAnswer();
        if (cC == "Rock" && pC == "Scissors" || cC == "Paper" && pC == "Rock" || cC == "Scissors" && pC == "Paper") {
            return "Computer Wins";
        } else if (pC == "Rock" && cC == "Scissors" || pC == "Paper" && cC == "Rock" || pC == "Scissors" && cC == "Paper") {
            return "You Win";
        } else if(cC == pC){
            return "It's a draw!";
        } else
            return null;
    }
}
