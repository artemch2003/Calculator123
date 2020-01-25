package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "privet", Toast.LENGTH_LONG).show();
        Log.d("welt", "guten hrjack");
        Log.e("qwerty", "assdf");
        b1= findViewById(R.id.b1) ;
    }

    @Override
    public void onClick(View v) {
        String s = ((Button) v).getText().toString();
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
