package com.example.root.miltiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    public void onClickTwo(View view)
    {
        if (view.getId()==R.id.button2)
        {
            Intent ia=new Intent(Main2Activity.this,Main3Activity.class);

            startActivity(ia);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent ib=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(ib);
    }
}


