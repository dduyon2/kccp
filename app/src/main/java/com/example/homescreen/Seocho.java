package com.example.homescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Seocho extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seocho);

        Button b1 = (Button) findViewById(R.id.back_button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                intent2.setFlags(intent2.FLAG_ACTIVITY_SINGLE_TOP|intent2.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent2);
            }
        });

    }
}
