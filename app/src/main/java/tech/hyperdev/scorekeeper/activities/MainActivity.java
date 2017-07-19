package tech.hyperdev.scorekeeper.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    private int counterOne = 0;
    private int counterTwo = 0;

    ImageButton teamOnePlus;
    ImageButton teamOneMinus;
    TextView scoreTeamOne;

    ImageButton teamTwoPlus;
    ImageButton teamTwoMinus;
    TextView scoreTeamTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamOnePlus = (ImageButton) findViewById(R.id.btnPlus);
        teamOneMinus = (ImageButton) findViewById(R.id.btnMinus);
        scoreTeamOne = (TextView) findViewById(R.id.textView2);

        teamTwoPlus = (ImageButton) findViewById(R.id.imageAdd);
        teamTwoMinus = (ImageButton) findViewById(R.id.imageMinus);
        scoreTeamTwo = (TextView) findViewById(R.id.textView3);


        teamOnePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterOne ++;
                scoreTeamOne.setText(Integer.toString(counterOne));
            }
        });
        teamOneMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterOne --;
                scoreTeamOne.setText(Integer.toString(counterOne));
            }
        });


        teamTwoPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterTwo ++;
                scoreTeamTwo.setText(Integer.toString(counterTwo));
            }
        });
        teamTwoMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterTwo --;
                scoreTeamTwo.setText(Integer.toString(counterTwo));
            }
        });


    }
}
