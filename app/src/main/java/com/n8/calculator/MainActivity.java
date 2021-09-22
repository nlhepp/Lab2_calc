package com.n8.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addClicked(View view) {
        EditText txt1 = (EditText)findViewById(R.id.enterNum1);
        EditText txt2 = (EditText)findViewById(R.id.enterNum2);
        String txt1s = txt1.getText().toString();
        String txt2s = txt2.getText().toString();
        int txt1num;
        int txt2num;
        try {
            txt1num = Integer.parseInt(txt1s);
        } catch (NumberFormatException nfe) {
            return;
        }
        try {
            txt2num = Integer.parseInt(txt2s);
        } catch (NumberFormatException nfe) {
            return;
        }
        int res = txt1num + txt2num;
        goToResult(res);
    }
    public void subClicked(View view) {
        EditText txt1 = (EditText)findViewById(R.id.enterNum1);
        EditText txt2 = (EditText)findViewById(R.id.enterNum2);
        String txt1s = txt1.getText().toString();
        String txt2s = txt2.getText().toString();
        int txt1num;
        int txt2num;
        try {
            txt1num = Integer.parseInt(txt1s);
        } catch (NumberFormatException nfe) {
            return;
        }
        try {
            txt2num = Integer.parseInt(txt2s);
        } catch (NumberFormatException nfe) {
            return;
        }
        int res = txt1num - txt2num;
        goToResult(res);
    }
    public void multClicked(View view) {
        EditText txt1 = (EditText)findViewById(R.id.enterNum1);
        EditText txt2 = (EditText)findViewById(R.id.enterNum2);
        String txt1s = txt1.getText().toString();
        String txt2s = txt2.getText().toString();
        int txt1num;
        int txt2num;
        try {
            txt1num = Integer.parseInt(txt1s);
        } catch (NumberFormatException nfe) {
            return;
        }
        try {
            txt2num = Integer.parseInt(txt2s);
        } catch (NumberFormatException nfe) {
            return;
        }
        int res = txt1num * txt2num;
        goToResult(res);
    }
    public void divClicked(View view) {
        EditText txt1 = (EditText)findViewById(R.id.enterNum1);
        EditText txt2 = (EditText)findViewById(R.id.enterNum2);
        String txt1s = txt1.getText().toString();
        String txt2s = txt2.getText().toString();
        int txt1num;
        int txt2num;
        try {
            txt1num = Integer.parseInt(txt1s);
        } catch (NumberFormatException nfe) {
            return;
        }
        try {
            txt2num = Integer.parseInt(txt2s);
        } catch (NumberFormatException nfe) {
            return;
        }
        int res = txt1num / txt2num;
        goToResult(res);
    }

    public void goToResult(int num) {
        Intent intent = new Intent(this, ResultAct.class);
        intent.putExtra("result", Integer.toString(num));
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}