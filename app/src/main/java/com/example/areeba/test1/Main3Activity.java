package com.example.areeba.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        configureTextb();
    }

    private void configureTextb()
    {
        Button ntt= (Button) findViewById(R.id.button2);
        ntt.setOnClickListener(new View.OnClickListener (){

        @Override
        public void onClick(View v) {
            finish();
        }
    });





    }

}
