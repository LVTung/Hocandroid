package com.example.tung.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt01,edt02;
    Button btn01;
    TextView txtv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        edt01 = (EditText)findViewById(R.id.editText01);
        edt02 = (EditText)findViewById(R.id.editText02);
        btn01 = (Button)findViewById(R.id.button01);
        txtv01 = (TextView)findViewById(R.id.textView01);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //code
        //gan sk cho button
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edt01.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                String chuoi2 = edt02.getText().toString();
                int so2 = Integer.parseInt(chuoi2);
                int Tong = so1 + so2;
                txtv01.setText(String.valueOf(Tong));
            }
        });
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
