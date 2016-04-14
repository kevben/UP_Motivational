package com.nitroja.kbennett.upmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivityModule extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_module);

        final Button button1 = (Button) findViewById(R.id.mainbutton);


        button1.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           Intent intent = new Intent(MainActivityModule.this, Quotes.class);
                                           startActivity(intent);
                                       }
                                   }
        );

    }
}
