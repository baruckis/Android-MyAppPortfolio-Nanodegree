package com.baruckis.nanodegree.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button buttonMediaStreamer;
    private Button buttonSuperDuo1;
    private Button buttonSuperDuo2;
    private Button buttonAntTerminator;
    private Button buttonMaterialize;
    private Button buttonCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMediaStreamer = (Button) findViewById(R.id.button_media_streamer);
        buttonSuperDuo1 = (Button) findViewById(R.id.button_super_duo1);
        buttonSuperDuo2 = (Button) findViewById(R.id.button_super_duo2);
        buttonAntTerminator = (Button) findViewById(R.id.button_ant_terminator);
        buttonMaterialize = (Button) findViewById(R.id.button_materialize);
        buttonCapstone = (Button) findViewById(R.id.button_capstone);

        buttonMediaStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = getString(R.string.toast_part_begin_msg) + "\"" + getString(R.string.button1_label) + "\"" + getString(R.string.toast_part_end_msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        buttonSuperDuo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = getString(R.string.toast_part_begin_msg) + "\"" + getString(R.string.button2_label) + "\"" + getString(R.string.toast_part_end_msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        buttonSuperDuo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = getString(R.string.toast_part_begin_msg) + "\"" + getString(R.string.button3_label) + "\"" + getString(R.string.toast_part_end_msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        buttonAntTerminator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = getString(R.string.toast_part_begin_msg) + "\"" + getString(R.string.button4_label) + "\"" + getString(R.string.toast_part_end_msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        buttonMaterialize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = getString(R.string.toast_part_begin_msg) + "\"" + getString(R.string.button5_label) + "\"" + getString(R.string.toast_part_end_msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = getString(R.string.toast_part_begin_msg) + "\"" + getString(R.string.button6_label) + "\"" + getString(R.string.toast_part_end_msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });
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
