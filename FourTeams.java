package com.example.matthewmoyer.scoreboard;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FourTeams extends AppCompatActivity {
Button b1, b2, b3, b4, b5, b6, b7, b8;
    private int i, j, x, y;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_teams);
        setTitle("4 Team Game");

//locks in portrait mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        b1 = (Button)findViewById(R.id.button1);
        b1.setText(new Integer(i).toString());
        //CYAN
        //colors codes taken from http://www.svpal.org/webhelp/colors.html
        b1.setBackgroundColor(Color.parseColor("#00FFFF"));

        b2 = (Button) findViewById(R.id.button2);
        b2.setText(new Integer(j).toString());
        //color orange
        b2.setBackgroundColor(Color.parseColor("#FFA500"));


        b3 = (Button) findViewById(R.id.button3);
        //DEEPSKYBLUE
        b3.setBackgroundColor(Color.parseColor("#00BFFF"));

        b4 = (Button) findViewById(R.id.button4);
        // DARK ORANGE
        b4.setBackgroundColor(Color.parseColor("#FF8C00"));


        b5 = (Button) findViewById(R.id.button5);
        b5.setText(new Integer(x).toString());
        //medium orchid
        b5.setBackgroundColor(Color.parseColor("#BA55D3"));


        b6 = (Button) findViewById(R.id.button6);
        b6.setText(new Integer(y).toString());
        //LIME
        b6.setBackgroundColor(Color.parseColor("#00FF00"));





        b7 = (Button) findViewById(R.id.button7);
        //dark orchid
        b7.setBackgroundColor(Color.parseColor("#9932CC"));


        b8 = (Button) findViewById(R.id.button8);
        //LIMEGREEN
        b8.setBackgroundColor(Color.parseColor("#32CD32"));


        createListeners();


    }


    private void createListeners(){

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                i++;

                b1.setText(new Integer(i).toString());


                ;



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
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;

                b5.setText(new Integer(x).toString());
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y++;

                b6.setText(new Integer(y).toString());
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x--;
                b5.setText(new Integer(x).toString());

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y--;
                b6.setText(new Integer(y).toString());

            }
        });


    }

    private void startActivity4(){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_four_teams, menu);
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
