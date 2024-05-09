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

public class Fourthtest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fourthtest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton forth_imageButton = findViewById(R.id.forth_imageButton);
        forth_imageButton.setImageResource(R.drawable.little2);
        Button forth_first_que_first = findViewById(R.id.forth_first_que_first);
        Button forth_first_que_second = findViewById(R.id.forth_first_que_second);
        Button forth_first_que_third = findViewById(R.id.forth_first_que_third);
        RadioGroup forth_radioGroup = findViewById(R.id.forth_first_que);

        forth_radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.forth_first_que_first) {
                    forth_first_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_first_que_second) {
                    forth_first_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_first_que_third) {
                    forth_first_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
        Button forth_second_que_first = findViewById(R.id.forth_second_que_first);
        Button forth_second_que_second = findViewById(R.id.forth_second_que_second);
        Button forth_second_que_third = findViewById(R.id.forth_second_que_third);
        RadioGroup forth_radioGroup2 = findViewById(R.id.forth_second_que);

        forth_radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.forth_second_que_first) {
                    forth_second_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_second_que_second) {
                   forth_second_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_second_que_third) {
                    forth_second_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });
        Button  forth_third_que_first = findViewById(R.id. forth_third_que_first);
        Button  forth_third_que_second = findViewById(R.id. forth_third_que_second);
        Button  forth_third_que_third = findViewById(R.id. forth_third_que_third);
        RadioGroup forth_radioGroup3 = findViewById(R.id.forth_third_que);

        forth_radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. forth_third_que_first) {
                    forth_third_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. forth_third_que_second) {
                    forth_third_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_third_que_third) {
                    forth_third_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  forth_fourth_que_first = findViewById(R.id. forth_fourth_que_first);
        Button  forth_fourth_que_second = findViewById(R.id. forth_fourth_que_second);
        Button  forth_fourth_que_third = findViewById(R.id. forth_fourth_que_third);
        RadioGroup  forth_radioGroup4 = findViewById(R.id. forth_fourth_que);

       forth_radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. forth_fourth_que_first) {
                    forth_fourth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. forth_fourth_que_second) {
                    forth_fourth_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_fourth_que_third) {
                    forth_fourth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  forth_fifth_que_first = findViewById(R.id. forth_fifth_que_first);
        Button  forth_fifth_que_second = findViewById(R.id. forth_fifth_que_second);
        Button  forth_fifth_que_third = findViewById(R.id. forth_fifth_que_third);
        RadioGroup  forth_radioGroup5 = findViewById(R.id. forth_fifth_que);


        forth_radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. forth_fifth_que_first) {
                    forth_fifth_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. forth_fifth_que_second) {
                    forth_fifth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_fifth_que_third) {
                    forth_fifth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });

        Button  forth_sixth_que_first = findViewById(R.id. forth_sixth_que_first);
        Button  forth_sixth_que_second = findViewById(R.id. forth_sixth_que_second);
        Button  forth_sixth_que_third = findViewById(R.id. forth_sixth_que_third);
        RadioGroup  forth_radioGroup6 = findViewById(R.id. forth_sixth_que);


        forth_radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. forth_sixth_que_first) {
                    forth_sixth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. forth_sixth_que_second) {
                   forth_sixth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. forth_sixth_que_third) {
                    forth_sixth_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });

        Button  forth_seventh_que_first = findViewById(R.id.forth_seventh_que_first);
        Button  forth_seventh_que_second = findViewById(R.id.forth_seventh_que_second);
        Button  forth_seventh_que_third = findViewById(R.id.forth_seventh_que_third);
        RadioGroup  forth_radioGroup7 = findViewById(R.id. forth_seventh_que);


        forth_radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.forth_seventh_que_first) {
                    forth_seventh_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_seventh_que_second) {
                    forth_seventh_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. forth_seventh_que_third) {
                   forth_seventh_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });

        Button  forth_eight_que_first = findViewById(R.id. forth_eight_que_first);
        Button  forth_eight_que_second = findViewById(R.id.forth_eight_que_second);
        Button  forth_eight_que_third = findViewById(R.id.forth_eight_que_third);
        RadioGroup  forth_radioGroup8 = findViewById(R.id.forth_eight_que);


        forth_radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.forth_eight_que_first) {
                    forth_eight_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_eight_que_second) {
                    forth_eight_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_eight_que_third) {
                   forth_eight_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });

        Button  forth_ninth_que_first = findViewById(R.id. forth_ninth_que_first);
        Button  forth_ninth_que_second = findViewById(R.id.forth_ninth_que_second);
        Button forth_ninth_que_third = findViewById(R.id. forth_ninth_que_third);
        RadioGroup  forth_radioGroup9 = findViewById(R.id.forth_ninth_que);


        forth_radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. forth_ninth_que_first) {
                    forth_ninth_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_ninth_que_second) {
                   forth_ninth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_ninth_que_third) {
                    forth_ninth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });

        Button  forth_tenth_que_first = findViewById(R.id.forth_tenth_que_first);
        Button  forth_tenth_que_second = findViewById(R.id.forth_tenth_que_second);
        Button  forth_tenth_que_third = findViewById(R.id.forth_tenth_que_third);
        RadioGroup forth_radioGroup10 = findViewById(R.id.forth_tenth_que);


        forth_radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.forth_tenth_que_first) {
                    forth_tenth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. forth_tenth_que_second) {
                    forth_tenth_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_tenth_que_third) {
                    forth_tenth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  forth_eleventh_que_first = findViewById(R.id.forth_eleventh_que_first);
        Button  forth_eleventh_que_second = findViewById(R.id.forth_eleventh_que_second);
        Button  forth_eleventh_que_third = findViewById(R.id.forth_eleventh_que_third);
        RadioGroup  forth_radioGroup11 = findViewById(R.id.forth_eleventh_que);


        forth_radioGroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.forth_eleventh_que_first) {
                    forth_eleventh_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. forth_eleventh_que_second) {
                    forth_eleventh_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_eleventh_que_third) {
                    forth_eleventh_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  forth_twelv_que_first = findViewById(R.id.forth_twelv_que_first);
        Button  forth_twelv_que_second = findViewById(R.id.forth_twelv_que_second);
        Button forth_twelv_que_third = findViewById(R.id.forth_twelv_que_third);
        RadioGroup  forth_radioGroup12 = findViewById(R.id.forth_twelv_que);


        forth_radioGroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.forth_twelv_que_first) {
                    forth_twelv_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_twelv_que_second) {
                    forth_twelv_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.forth_twelv_que_third) {
                   forth_twelv_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });

        Button  forth_thirteen_que_first = findViewById(R.id.forth_thirteen_que_first);
        Button  forth_thirteen_que_second = findViewById(R.id.forth_thirteen_que_second);
        Button  forth_thirteen_que_third = findViewById(R.id.forth_thirteen_que_third);
        RadioGroup  forth_radioGroup13 = findViewById(R.id.forth_thirteen_que);


        forth_radioGroup13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. forth_thirteen_que_first) {
                    forth_thirteen_que_first.setTextColor(Color.rgb(255, 79, 100));
                    forth_imageButton.setImageResource(R.drawable.super2);
                } else if (checkedId == R.id.forth_thirteen_que_second) {
                    forth_thirteen_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.forth_thirteen_que_third) {
                   forth_thirteen_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
    }

}
