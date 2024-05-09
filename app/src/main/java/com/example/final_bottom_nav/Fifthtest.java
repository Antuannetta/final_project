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

public class Fifthtest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fifthtest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton fifth_imageButton = findViewById(R.id.fifth_imageButton);
        fifth_imageButton.setImageResource(R.drawable.little2);
        Button fifth_first_que_first = findViewById(R.id.fifth_first_que_first);
        Button fifth_first_que_second = findViewById(R.id.fifth_first_que_second);
        Button fifth_first_que_third = findViewById(R.id.fifth_first_que_third);
        RadioGroup fifth_radioGroup = findViewById(R.id.fifth_first_que);

       fifth_radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fifth_first_que_first) {
                    fifth_first_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.fifth_first_que_second) {
                   fifth_first_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.fifth_first_que_third) {
                   fifth_first_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button fifth_second_que_first = findViewById(R.id.fifth_second_que_first);
        Button fifth_second_que_second = findViewById(R.id.fifth_second_que_second);
        Button fifth_second_que_third = findViewById(R.id.fifth_second_que_third);
        RadioGroup fifth_radioGroup2 = findViewById(R.id.fifth_second_que);

        fifth_radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fifth_second_que_first) {
                    fifth_second_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.fifth_second_que_second) {
                    fifth_second_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.fifth_second_que_third) {
                    fifth_second_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button fifth_third_que_first = findViewById(R.id.fifth_third_que_first);
        Button fifth_third_que_second = findViewById(R.id.fifth_third_que_second);
        Button fifth_third_que_third = findViewById(R.id.fifth_third_que_third);
        RadioGroup fifth_radioGroup3 = findViewById(R.id.fifth_third_que);

        fifth_radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fifth_third_que_first) {
                    fifth_third_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.fifth_third_que_second) {
                    fifth_third_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.fifth_third_que_third) {
                    fifth_third_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button fifth_fourth_que_first = findViewById(R.id.fifth_fourth_que_first);
        Button fifth_fourth_que_second = findViewById(R.id.fifth_fourth_que_second);
        Button fifth_fourth_que_third = findViewById(R.id.fifth_fourth_que_third);
        RadioGroup fifth_radioGroup4 = findViewById(R.id.fifth_fourth_que);

       fifth_radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fifth_fourth_que_first) {
                    fifth_fourth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.fifth_fourth_que_second) {
                    fifth_fourth_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.fifth_fourth_que_third) {
                   fifth_fourth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button fifth_fifth_que_first = findViewById(R.id.fifth_fifth_que_first);
        Button fifth_fifth_que_second = findViewById(R.id.fifth_fifth_que_second);
        Button fifth_fifth_que_third = findViewById(R.id.fifth_fifth_que_third);
        RadioGroup fifth_radioGroup5 = findViewById(R.id.fifth_fifth_que);


        fifth_radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fifth_fifth_que_first) {
                    fifth_fifth_que_first.setTextColor(Color.rgb(255, 79, 100));
                    fifth_imageButton.setImageResource(R.drawable.super2);
                } else if (checkedId == R.id.fifth_fifth_que_second) {
                    fifth_fifth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.fifth_fifth_que_third) {
                    fifth_fifth_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
    }

}
