package example.codeclan.com.rps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RockPaperScissorActivity extends AppCompatActivity {

    ImageButton paper;
    ImageButton rock;
    ImageButton scissors;
    TextView result;
    TextView computerAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissor);
        paper = findViewById(R.id.paper);
        rock = findViewById(R.id.rock);
        scissors = findViewById(R.id.scissors);
        result = findViewById(R.id.result);
        computerAnswer = findViewById(R.id.computerAnswer);


    }

    public void onClickButtonRock(View rock){
        Game game = new Game();
        String randomAnswer = game.getRandomAnswer();
        String outcome = game.getResult("Rock", randomAnswer);
        result.setText(outcome);
        computerAnswer.setText(randomAnswer);
    }

    public void onClickButtonPaper(View paper){
        Game game = new Game();
        String randomAnswer = game.getRandomAnswer();
        String outcome = game.getResult("Paper", randomAnswer);
        result.setText(outcome);
        computerAnswer.setText(randomAnswer);
    }

    public void onClickButtonScissors(View scissors){
        Game game = new Game();
        String randomAnswer = game.getRandomAnswer();
        String outcome = game.getResult("Scissors", randomAnswer);
        result.setText(outcome);
        computerAnswer.setText(randomAnswer);

    }


}
