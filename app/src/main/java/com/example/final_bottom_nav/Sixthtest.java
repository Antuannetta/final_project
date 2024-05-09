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

public class Sixthtest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sixthtest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton sixth_imageButton = findViewById(R.id.sixth_imageButton);
        sixth_imageButton.setImageResource(R.drawable.little2);
        Button sixth_first_que_first = findViewById(R.id.sixth_first_que_first);
        Button sixth_first_que_second = findViewById(R.id.sixth_first_que_second);
        Button sixth_first_que_third = findViewById(R.id.sixth_first_que_third);
        RadioGroup sixth_radioGroup = findViewById(R.id.sixth_first_que);

       sixth_radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.sixth_first_que_first) {
                    sixth_first_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.sixth_first_que_second) {
                    sixth_first_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.sixth_first_que_third) {
                    sixth_first_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button sixth_second_que_first = findViewById(R.id.sixth_second_que_first);
        Button sixth_second_que_second = findViewById(R.id.sixth_second_que_second);
        Button sixth_second_que_third = findViewById(R.id.sixth_second_que_third);
        RadioGroup sixth_radioGroup2 = findViewById(R.id.sixth_second_que);

        sixth_radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.sixth_second_que_first) {
                    sixth_second_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.sixth_second_que_second) {
                    sixth_second_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.sixth_second_que_third) {
                    sixth_second_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button sixth_third_que_first = findViewById(R.id.sixth_third_que_first);
        Button sixth_third_que_second = findViewById(R.id.sixth_third_que_second);
        Button sixth_third_que_third = findViewById(R.id.sixth_third_que_third);
        RadioGroup sixth_radioGroup3 = findViewById(R.id.sixth_third_que);

        sixth_radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.sixth_third_que_first) {
                    sixth_third_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.sixth_third_que_second) {
                    sixth_third_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.sixth_third_que_third) {
                    sixth_third_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
        Button sixth_fourth_que_first = findViewById(R.id.sixth_fourth_que_first);
        Button sixth_fourth_que_second = findViewById(R.id.sixth_fourth_que_second);
        Button sixth_fourth_que_third = findViewById(R.id.sixth_fourth_que_third);
        RadioGroup sixth_radioGroup4 = findViewById(R.id.sixth_fourth_que);

        sixth_radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.sixth_fourth_que_first) {
                    sixth_fourth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.sixth_fourth_que_second) {
                    sixth_fourth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.sixth_fourth_que_third) {
                    sixth_fourth_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
        Button sixth_fifth_que_first = findViewById(R.id.sixth_fifth_que_first);
        Button sixth_fifth_que_second = findViewById(R.id.sixth_fifth_que_second);
        Button sixth_fifth_que_third = findViewById(R.id.sixth_fifth_que_third);
        RadioGroup sixth_radioGroup5 = findViewById(R.id.sixth_fifth_que);


        sixth_radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.sixth_fifth_que_first) {
                    sixth_fifth_que_first.setTextColor(Color.rgb(101, 235, 145));
                    sixth_imageButton.setImageResource(R.drawable.super2);
                } else if (checkedId == R.id.sixth_fifth_que_second) {
                    sixth_fifth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.sixth_fifth_que_third) {
                    sixth_fifth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
    }
}
