package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int aCounter= 0,bCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void apointer_3(View view) {
        aCounter = aCounter + 3;
        display_a(aCounter);
    }

    public void apointer_2(View view) {
        aCounter = aCounter + 2;
        display_a(aCounter);
    }

    public void apointer_free(View view) {
        aCounter = aCounter + 1;
        display_a(aCounter);
    }

    public void bpointer_3(View view) {
        bCounter = bCounter + 3;
        display_b(bCounter);
    }

    public void bpointer_2(View view) {
        bCounter = bCounter + 2;
        display_b(bCounter);
    }

    public void bpointer_free(View view) {
        bCounter = bCounter + 1;
        display_b(bCounter);
    }

    public void display_a(int n) {
        TextView t = (TextView)findViewById(R.id.team_a_score);
        t.setText("" + n);
    }

    public void display_b(int n) {
        TextView t = (TextView)findViewById(R.id.team_b_score);
        t.setText(""+ n);
    }

    public void reset(View view) {
        aCounter = 0;
        bCounter = 0;
        display_a(0);
        display_b(0);
    }
}
