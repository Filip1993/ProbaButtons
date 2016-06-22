package com.filipkesteli.probabuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setupListeners();
        setupListeners2();
    }

    private void initWidgets() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
    }

    private void setupListeners() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == btn1) {

        } else if (v == btn2) {

        } else if (v == btn3) {

        }
    }

    private class Buttonsss implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (v == btn1) {

            } else if (v == btn2) {

            } else if (v == btn3) {

            }
        }
    }

    private void setupListeners2() {
        Buttonsss buttonsss = new Buttonsss();
        View view = new View(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        buttonsss.onClick(view);
    }

}
