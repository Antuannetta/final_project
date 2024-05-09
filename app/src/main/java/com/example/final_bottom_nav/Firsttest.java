package com.example.final_bottom_nav;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Firsttest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_firsttest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton first_imageButton = findViewById(R.id.first_imageButton);
        first_imageButton.setImageResource(R.drawable.little2);
        Button first_que_first = findViewById(R.id.first_que_first);
        Button first_que_second = findViewById(R.id.first_que_second);
        Button first_que_third = findViewById(R.id.first_que_third);
        RadioGroup radioGroup = findViewById(R.id.first_que);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.first_que_first) {
                    first_que_first.setTextColor(Color.RED);
                } else if (checkedId == R.id.first_que_second) {
                    first_que_second.setTextColor(Color.GREEN);
                }
                else if (checkedId == R.id.first_que_third) {
                    first_que_third.setTextColor(Color.RED);
                }
            }
        });
        Button second_que_first = findViewById(R.id.second_que_first);
        Button second_que_second = findViewById(R.id.second_que_second);
        Button second_que_third = findViewById(R.id.second_que_third);
        RadioGroup radioGroup2 = findViewById(R.id.second_que);

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.second_que_first) {
                   second_que_first.setTextColor(Color.RED);
                } else if (checkedId == R.id.second_que_second) {
                    second_que_second.setTextColor(Color.RED);
                }
                else if (checkedId == R.id.second_que_third) {
                    second_que_third.setTextColor(Color.GREEN);
                }
            }
        });
        Button third_que_first = findViewById(R.id.third_que_first);
        Button third_que_second = findViewById(R.id.third_que_second);
        Button third_que_third = findViewById(R.id.third_que_third);
        RadioGroup radioGroup3 = findViewById(R.id.third_que);

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.third_que_first) {
                    third_que_first.setTextColor(Color.GREEN);
                } else if (checkedId == R.id.third_que_second) {
                    third_que_second.setTextColor(Color.RED);
                }
                else if (checkedId == R.id.third_que_third) {
                    third_que_third.setTextColor(Color.RED);
                }
            }
        });
        Button fourth_que_first = findViewById(R.id.fourth_que_first);
        Button fourth_que_second = findViewById(R.id.fourth_que_second);
        Button fourth_que_third = findViewById(R.id.fourth_que_third);
        RadioGroup radioGroup4 = findViewById(R.id.fourth_que);

        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fourth_que_first) {
                    fourth_que_first.setTextColor(Color.RED);
                } else if (checkedId == R.id.fourth_que_second) {
                    fourth_que_second.setTextColor(Color.GREEN);
                }
                else if (checkedId == R.id.fourth_que_third) {
                    fourth_que_third.setTextColor(Color.RED);
                }
            }
        });
        Button fifth_que_first = findViewById(R.id.fifth_que_first);
        Button fifth_que_second = findViewById(R.id.fifth_que_second);
        Button fifth_que_third = findViewById(R.id.fifth_que_third);
        RadioGroup radioGroup5 = findViewById(R.id.fifth_que);

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fifth_que_first) {
                    fifth_que_first.setTextColor(Color.GREEN);
                    first_imageButton.setImageResource(R.drawable.super2);
                } else if (checkedId == R.id.fifth_que_second) {
                    fifth_que_second.setTextColor(Color.RED);
                }
                else if (checkedId == R.id.fifth_que_third) {
                    fifth_que_third.setTextColor(Color.RED);
                }
            }
        });

    }
}
