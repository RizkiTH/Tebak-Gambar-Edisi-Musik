package com.ram.iak.tebakgambaredisimusik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rizki The Hedgeman on 10-05-2017.
 */

public class aboutActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        TextView mulai = (TextView) findViewById(R.id.mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(aboutActivity.this, quizActivity.class);
                startActivity(intent);
            }
        });
    }
}
