package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class secondActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiy);


        TextView num1 = findViewById(R.id.textview1);
        TextView num2 = findViewById(R.id.textView2);
        TextView num3 = findViewById(R.id.textview3);
        TextView num4 = findViewById(R.id.textView4);
        TextView num5 = findViewById(R.id.textView5);
        TextView num6 = findViewById(R.id.textView6);
        TextView num7 = findViewById(R.id.textView7);
        ImageView num8 = findViewById(R.id.imageView2);


        Bundle bundle = getIntent().getExtras();
        String string1 = bundle.getString("name");
        String string2 = bundle.getString("age");
        String string3 = bundle.getString("hobby");

        if(bundle!=null) {
            int res_image = bundle.getInt("imageView3");

            num8.setImageResource(res_image);
        }


        num3.setText(string1);
        num5.setText(string2);
        num7.setText(string3);
//        num8.setIma;
    }
}