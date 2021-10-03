package com.thefear.androidstart;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    public void onClick(View view) {{
        Intent i;
        i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
    }

}