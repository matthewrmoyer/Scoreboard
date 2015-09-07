package com.example.matthewmoyer.scoreboard;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CurrentScore extends AppCompatActivity {
   Button b1, b2, b3, b4;

    private int i;
    private int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_score);

        setTitle("Current Score");

//locks orientation in portrait mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        b1 = (Button) findViewById(R.id.button1);
        //converts int i to a string so it can be shown on the button
        b1.setText(new Integer(i).toString());


        b2 = (Button) findViewById(R.id.button2);

        b2.setText(new Integer(j).toString());

        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);






        Log.i("CurrentScoreActivity", " in currentscore oncreate");
        createListeners();
    }

    //saves int i when screen rotates, dont bother finishing, just lock in portrait mode
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt("team1score", i);
    }
//continues with above, not finished
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        i = savedInstanceState.getInt("team1score");
    }

    protected void onStart(){
        super.onStart();
        Log.i("CurrentScoreActivity", "in currentscore onstart");
    }

    protected void onPause(){
        super.onPause();
        Log.i("CurrentScoreActivity", "in currentscore onpause");
    }

    protected void onStop(){
        super.onStop();
        Log.i("CurrentScoreActivity", "in currentscore onstop");
    }


    protected void onDestroy(){
        super.onDestroy();
        Log.i("CurrentScoreActivity", "in currentscore ondestroy");
    }
    protected void onRestart(){
        super.onRestart();
        Log.i("CurrentScoreActivity", "in currentscore onrestart");
    }

    private void createListeners(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 i++;

                b1.setText(new Integer(i).toString());



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j++;

                b2.setText(new Integer(j).toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                b1.setText(new Integer(i).toString());

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j--;
                b2.setText(new Integer(j).toString());

            }
        });

    }

private void startActivity3(){
    Intent intent = new Intent(this, Activity3.class);
    startActivity(intent);
}


    //makes back button go to activity 3
@Override
public void onBackPressed(){
    Intent intent = new Intent(this, Activity3.class);
    startActivity(intent);


}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_current_score, menu);
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

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
