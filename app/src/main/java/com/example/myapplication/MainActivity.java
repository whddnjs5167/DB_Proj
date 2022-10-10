package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //금연구역 장소 보기 액티비티 실행
        ImageButton nonsmoking;
        nonsmoking = findViewById(R.id.nosmokingBnt);
        nonsmoking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, NosmokingActivity.class));
            }
        });

        //흡연구역 장소 보기 액티비티 실행
        ImageButton smoking;
        smoking = findViewById(R.id.smokingBnt);
        smoking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SmokingActivity.class));
            }
        });

        //정보 보기 액티비티 실행
        ImageButton inform;
        inform = findViewById(R.id.informBnt);
        inform.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, InformationActivity.class));
            }
        });
    }
}