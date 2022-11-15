package com.example.test_duan1_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.layoutt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,res.class);
                startActivity(intent);
            }
        });


//anhxa

//        input = findViewById(R.id.textinput);
//        input.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                text = input.getText().length();
//                if(input.length()>10){
//                    input.getText().delete(text -1,text);
//                    findViewById(R.id.textinputlayout)
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//
//            }
//        });
//
//    }
    }

}