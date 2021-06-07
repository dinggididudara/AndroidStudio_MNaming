package com.naming.meownaming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.meownaming.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t1=(TextView)findViewById(R.id.textView1);
        final TextView t2=(TextView)findViewById(R.id.textView2);
        Button button=(Button)findViewById(R.id.button);

        String str1[] = {"하","콩","달","별","모","나","쿠","레","누","후","루","호","루","호","다","누","동","코","다","야","냐"};
        String str2[] = {"이","라","리","유","나","야","오","아","야","나","아","우","야","냐","이","이","이","누","이","이","이"};
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

        for(int i=0;i<str1.length;i++) {
            int r = (int)Math.floor(Math.random()*21);

            if(r<str1.length) {
                t1.setText(String.valueOf(str1[r]));
            }else {i++;}

        }

        for (int j=0;j<str2.length;j++){
            int d = (int)Math.floor(Math.random()*21);

            if(d<str2.length){
                t2.setText(String.valueOf(str2[d]));
            }else{j++;}
        }
                Toast.makeText(getApplicationContext(), "만들었어요!", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView flower = (ImageView) findViewById(R.id.flower);
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        flower.startAnimation(anim);
    }
}