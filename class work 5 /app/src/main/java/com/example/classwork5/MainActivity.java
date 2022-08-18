package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView a = findViewById(R.id.textview1);
        EditText b = findViewById(R.id.ed1);
        EditText c = findViewById(R.id.ed2);
        EditText d = findViewById(R.id.ed3);
        ImageView e = findViewById(R.id.imageView3);
        Button f = findViewById(R.id.button);


        String ed1 = b.getText().toString();
        String ed2 = c.getText().toString();
        String ed3 = d.getText().toString();

//
                f.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view){


                        String ed1 = (b.getText().toString());
                        String ed2 = (c.getText().toString());
                        String ed3 = (d.getText().toString());

                        if (ed1.isEmpty() || ed2.isEmpty() || ed3.isEmpty()) {
                            Toast.makeText(MainActivity.this, "Complete the requiere info", Toast.LENGTH_SHORT).show();
                            return;
                        }


                        Intent plane = new Intent(MainActivity.this, secondActiviy.class);

                        plane.putExtra("name", ed1);
                        plane.putExtra("age", ed2);
                        plane.putExtra("hobby", ed3);
                        plane.putExtra("imageView3", R.drawable.identification_card_icon_personal_info_data_icon_vector_28695438);

                        startActivity(plane);



                }
            });
        }
    }