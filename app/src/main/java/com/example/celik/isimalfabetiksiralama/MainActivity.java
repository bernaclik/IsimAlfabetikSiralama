package com.example.celik.isimalfabetiksiralama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
        Button sirala;
        EditText isim;
        TextView tv;
        String yazi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sirala = (Button) findViewById(R.id.tikla);
        isim = (EditText) findViewById(R.id.isim);
        tv = (TextView) findViewById(R.id.textView);

    }

    public void sirala(View view) {
        tv.setText("Sonuc ");
        yazi = isim.getText().toString().toLowerCase();
        String [] yazi2;
        yazi2 = yazi.split(" ");
        Arrays.sort(yazi2);


        for(int i =0;i<yazi2.length;i++){

            tv.append(" " + yazi2[i] +" ");
        }





    }
}
