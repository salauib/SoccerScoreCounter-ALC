package com.example.android.soccerscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int cornersA = 0;
    int cornersB = 0;

    int possessionTeamA = 0;
    int possessionTeamB = 0;

    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;

    int redCardsTeamA = 0;
    int redCardsTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
        displayForTeamB(0);

        displayForCornersA(0);
        displayForCornersB(0);

        displayForPossessionA(0);
        displayForPossessionB(0);

        displayForYellowCardsA(0);
        displayForYellowCardsB(0);

        displayForRedCardsA(0);
        displayForRedCardsB(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //For Team AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    /**
     * Add One Score for Team A.
     */
    public void addOneScoreForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add One for corner A.
     */
    public void addOneScoreForCornersA(View v) {
        cornersA = cornersA + 1;
        displayForCornersA(cornersA);
    }

    /**
     * Add one for possession A
     */
    public void addOneForPossessionA(View v) {
        possessionTeamA = possessionTeamA + 1;
        displayForPossessionA(possessionTeamA);
    }

    /**
     * Add one for yellow cards A
     */
    public void addOneForYellowCardsA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayForYellowCardsA(yellowCardsTeamA);
    }

    /**
     * Add one for red cards A
     */
    public void addOneForRedCardsA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayForRedCardsA(redCardsTeamA);
    }


    //For Team BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB

    /**
     * Add One for Team B.
     */
    public void addOneScoreForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add One for corner B.
     */
    public void addOneScoreForCornersB(View v) {
        cornersB = cornersB + 1;
        displayForCornersB(cornersB);
    }

    /**
     * Add one for possession B
     */
    public void addOneForPossessionB(View v) {
        possessionTeamB = possessionTeamB + 1;
        displayForPossessionB(possessionTeamB);
    }

    /**
     * Add one for yellow cards B
     */
    public void addOneForYellowCardsB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayForYellowCardsB(yellowCardsTeamB);
    }

    /**
     * Add one for red cards B
     */
    public void addOneForRedCardsB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayForRedCardsB(redCardsTeamB);
    }

    /**
     * Reset button
     */
    public void resetScore(View v) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);

        cornersA = 0;
        cornersB = 0;
        displayForCornersA(0);
        displayForCornersB(0);

        possessionTeamA = 0;
        possessionTeamB = 0;
        displayForPossessionA(0);
        displayForPossessionB(0);

        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        displayForYellowCardsA(0);
        displayForYellowCardsB(0);

        redCardsTeamA = 0;
        redCardsTeamB = 0;
        displayForRedCardsA(0);
        displayForRedCardsB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team corner A.
     */
    private void displayForCornersA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team possession A.
     */
    private void displayForPossessionA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score_possession);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for yellow cards A.
     */
    private void displayForYellowCardsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for red cards A.
     */
    private void displayForRedCardsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_cards);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team corner B.
     */
    private void displayForCornersB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team possession B.
     */
    private void displayForPossessionB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score_possession);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for yellow cards B.
     */
    private void displayForYellowCardsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for red cards B.
     */
    private void displayForRedCardsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_cards);
        scoreView.setText(String.valueOf(score));
    }
}
