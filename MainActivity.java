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

public class MainActivity extends AppCompatActivity {

    Button b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        Log.d("MainActivity", "in oncreate");
        Log.i("MainActivity", "Inside onCreate Method");
        Log.e("MainAvtivity", "Inside oncreate method");

        setTitle("Scoreboard");

        createListeners();

        //locks in portait mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



    }

    private void createListeners() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCurrentScoreActivity();

            }
        });

b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startFourTeamsActivity();

    }
});

        };







//starts currentscoreactivity
    private void startCurrentScoreActivity() {
        Intent intent = new Intent(this, CurrentScore.class);
        startActivity(intent);

    }

    private void startFourTeamsActivity(){
        Intent intent = new Intent(this, FourTeams.class);
        startActivity(intent);
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


}
