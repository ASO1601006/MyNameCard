package com.example.a_nande.mynamecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButton(View view){
        TextView textview = (TextView)findViewById(R.id.textView3);
        textview.setText("ゆう");
    }
}
