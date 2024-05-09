package com.example.final_bottom_nav;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Secondtest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondtest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton second_imageButton = findViewById(R.id.second_imageButton);
        second_imageButton.setImageResource(R.drawable.little2);
        Button second_first_que_first = findViewById(R.id.second_first_que_first);
        Button second_first_que_second = findViewById(R.id.second_first_que_second);
        Button second_first_que_third = findViewById(R.id.second_first_que_third);
        RadioGroup second_radioGroup = findViewById(R.id.second_first_que);

        second_radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.second_first_que_first) {
                    second_first_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.second_first_que_second) {
                    second_first_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.second_first_que_third) {
                    second_first_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
        Button second_second_que_first = findViewById(R.id.second_second_que_first);
        Button second_second_que_second = findViewById(R.id.second_second_que_second);
        Button second_second_que_third = findViewById(R.id.second_second_que_third);
        RadioGroup second_radioGroup2 = findViewById(R.id.second_second_que);

        second_radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.second_second_que_first) {
                    second_second_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.second_second_que_second) {
                    second_second_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.second_second_que_third) {
                    second_second_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button second_third_que_first = findViewById(R.id.second_third_que_first);
        Button second_third_que_second = findViewById(R.id.second_third_que_second);
        Button second_third_que_third = findViewById(R.id.second_third_que_third);
        RadioGroup second_radioGroup3 = findViewById(R.id.second_third_que);

        second_radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.second_third_que_first) {
                    second_third_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.second_third_que_second) {
                    second_third_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.second_third_que_third) {
                    second_third_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button second_fourth_que_first = findViewById(R.id.second_fourth_que_first);
        Button second_fourth_que_second = findViewById(R.id.second_fourth_que_second);
        Button second_fourth_que_third = findViewById(R.id.second_fourth_que_third);
        RadioGroup second_radioGroup4 = findViewById(R.id.second_fourth_que);

        second_radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.second_fourth_que_first) {
                    second_fourth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.second_fourth_que_second) {
                    second_fourth_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.second_fourth_que_third) {
                    second_fourth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button second_fifth_que_first = findViewById(R.id.second_fifth_que_first);
        Button second_fifth_que_second = findViewById(R.id.second_fifth_que_second);
        Button second_fifth_que_third = findViewById(R.id.second_fifth_que_third);
        RadioGroup second_radioGroup5 = findViewById(R.id.second_fifth_que);


        second_radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.second_fifth_que_first) {
                    second_fifth_que_first.setTextColor(Color.rgb(101, 235, 145));
                    second_imageButton.setImageResource(R.drawable.super2);
                } else if (checkedId == R.id.second_fifth_que_second) {
                    second_fifth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.second_fifth_que_third) {
                    second_fifth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
    }

}
