package com.example.final_bottom_nav;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Seventhtest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seventhtest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton seventh_imageButton = findViewById(R.id.seventh_imageButton);
        seventh_imageButton.setImageResource(R.drawable.little2);
        Button seventh_first_que_first = findViewById(R.id.seventh_first_que_first);
        Button seventh_first_que_second = findViewById(R.id.seventh_first_que_second);
        Button seventh_first_que_third = findViewById(R.id.seventh_first_que_third);
        RadioGroup seventh_radioGroup = findViewById(R.id.seventh_first_que);

        seventh_radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.seventh_first_que_first) {
                    seventh_first_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.seventh_first_que_second) {
                    seventh_first_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.seventh_first_que_third) {
                    seventh_first_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
        Button seventh_second_que_first = findViewById(R.id.seventh_second_que_first);
        Button seventh_second_que_second = findViewById(R.id.seventh_second_que_second);
        Button seventh_second_que_third = findViewById(R.id.seventh_second_que_third);
        RadioGroup seventh_radioGroup2 = findViewById(R.id.seventh_second_que);

        seventh_radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.seventh_second_que_first) {
                    seventh_second_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.seventh_second_que_second) {
                    seventh_second_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.seventh_second_que_third) {
                    seventh_second_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button seventh_third_que_first = findViewById(R.id.seventh_third_que_first);
        Button seventh_third_que_second = findViewById(R.id.seventh_third_que_second);
        Button seventh_third_que_third = findViewById(R.id.seventh_third_que_third);
        RadioGroup seventh_radioGroup3 = findViewById(R.id.seventh_third_que);

        seventh_radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.seventh_third_que_first) {
                    seventh_third_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.seventh_third_que_second) {
                    seventh_third_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.seventh_third_que_third) {
                    seventh_third_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button seventh_fourth_que_first = findViewById(R.id.seventh_fourth_que_first);
        Button seventh_fourth_que_second = findViewById(R.id.seventh_fourth_que_second);
        Button seventh_fourth_que_third = findViewById(R.id.seventh_fourth_que_third);
        RadioGroup seventh_radioGroup4 = findViewById(R.id.seventh_fourth_que);

        seventh_radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.seventh_fourth_que_first) {
                    seventh_fourth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.seventh_fourth_que_second) {
                    seventh_fourth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.seventh_fourth_que_third) {
                    seventh_fourth_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
        Button seventh_fifth_que_first = findViewById(R.id.seventh_fifth_que_first);
        Button seventh_fifth_que_second = findViewById(R.id.seventh_fifth_que_second);
        Button seventh_fifth_que_third = findViewById(R.id.seventh_fifth_que_third);
        RadioGroup seventh_radioGroup5 = findViewById(R.id.seventh_fifth_que);


        seventh_radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.seventh_fifth_que_first) {
                    seventh_fifth_que_first.setTextColor(Color.rgb(255, 79, 100));
                    seventh_imageButton.setImageResource(R.drawable.super2);
                } else if (checkedId == R.id.seventh_fifth_que_second) {
                    seventh_fifth_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.seventh_fifth_que_third) {
                    seventh_fifth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
    }
}
