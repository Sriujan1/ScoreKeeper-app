package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalA=0;
    int goalB=0;
    int foulA=0;
    int foulB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**the method is called whenever the foul button is clicked
     **/
    public void increasegoalA(View view){
        goalA=goalA+1;
        displaygoalA(goalA);
    }
    /**the method is called whenever the foul button is clicked
     **/
    public void increasefoulA(View view){
        foulA=foulA+1;
        displayfoulA(foulA);
    }
/**displays the number of goals of team A
 *
 */
    public void displaygoalA(int i){
        TextView scoreview=(TextView) findViewById(R.id.goalsA);
        scoreview.setText(String.valueOf(i));
    }
    /**displays the number of fouls of team A
     *
     */
    public void displayfoulA(int i){
        TextView scoreview=(TextView) findViewById(R.id.foulsA);
        scoreview.setText(String.valueOf(i));

    }

    /**the method is called whenever the foul button is clicked
     **/
    public void increasegoalB(View view){
        goalB=goalB+1;
        displaygoalB(goalB);
    }
    /**the method is called whenever the foul button is clicked
     **/
    public void increasefoulB(View view){
        foulB=foulB+1;
        displayfoulB(foulB);
    }
    /**displays the number of goals of team B
     *
     */
    public void displaygoalB(int i){
        TextView scoreview=(TextView) findViewById(R.id.goalsB);
        scoreview.setText(String.valueOf(i));
    }
    /**displays the number of fouls of team B
     *
     */
    public void displayfoulB(int i){
        TextView scoreview=(TextView) findViewById(R.id.foulsB);
        scoreview.setText(String.valueOf(i));
        }

     public void resetfunction(View view)
     {
         goalB=0;
         goalA=0;
         foulB=0;
         foulA=0;
         displaygoalB(goalB);
         displayfoulB(foulB);
         displaygoalA(goalA);
         displayfoulA(foulA);
     }

}
