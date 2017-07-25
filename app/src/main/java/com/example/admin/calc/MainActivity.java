package com.example.admin.calc;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button decimal;
    private Button zero;
    private Button equals;
    private Button plus;
    private Button minus;
    private Button into;
    private Button divide;
    private Button clear;
    private TextView input;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input,getText().toString()="1");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input,getText().toString()="0");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input,getText().toString()="2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input,getText().toString()="3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()="4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input,getText().toString()="5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input,getText().toString()="6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input,getText().toString()="7");
            }
        });
    }


 private void setupUIView(){
     one=(Button)findViewById(R.id.btn1);
     two=(Button)findViewById(R.id.btn2);
     three=(Button)findViewById(R.id.btn3);
     four=(Button)findViewById(R.id.btn4);
     five=(Button)findViewById(R.id.btn5);
     six=(Button)findViewById(R.id.btn6);
     seven=(Button)findViewById(R.id.btn7);
     eight=(Button)findViewById(R.id.btn8);
     nine=(Button)findViewById(R.id.btn9);
     zero=(Button)findViewById(R.id.btn0);
     plus=(Button)findViewById(R.id.btnadd);
     minus=(Button)findViewById(R.id.btnsub);
     into=(Button)findViewById(R.id.btnmul);
     divide=(Button)findViewById(R.id.btndiv);
     clear=(Button)findViewById(R.id.btnclr);
     input=(TextView)findViewById(R.id.tvip);
     result=(TextView)findViewById(R.id.tvres);


  }

}
