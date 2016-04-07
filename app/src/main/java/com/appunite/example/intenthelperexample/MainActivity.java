package com.appunite.example.intenthelperexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.appunite.intenthelper.IntentHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final IntentHelper intentHelper = new IntentHelper();

        //noinspection ConstantConditions
        findViewById(R.id.activity_main_button)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final String text = "Return: " + intentHelper.isItWorking();
                        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
