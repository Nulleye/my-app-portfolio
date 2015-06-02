package com.nulleye.udacity.myappportolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PortfolioActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        //getSupportActionBar().setBackgroundDrawable(R.color.nulleye_foreground);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        Button button = (Button) findViewById(R.id.button1);
        if (button != null)  button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button2);
        if (button != null)  button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button3);
        if (button != null)  button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button4);
        if (button != null)  button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button5);
        if (button != null)  button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button6);
        if (button != null)  button.setOnClickListener(this);
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
            Toast.makeText(getApplicationContext(), R.string.not_implemented, Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String text = null;
        if (v instanceof Button) {
            Button button = (Button) v;
            Toast.makeText(getApplicationContext(),
                    String.format(getResources().getString(R.string.will_launch), button.getText()),
                    Toast.LENGTH_LONG).show();
        }
    }

}
