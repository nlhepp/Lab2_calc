package com.n8.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultact);
        TextView txtview = (TextView) findViewById(R.id.textViewRes);
        Intent intent = getIntent();
        String res = intent.getStringExtra("result");
        txtview.setText(res);
    }
    public void returnPrssd(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}