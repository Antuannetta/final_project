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

public class Thirdtest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thirdtest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton third_imageButton = findViewById(R.id.third_imageButton);
        third_imageButton.setImageResource(R.drawable.little2);
        Button third_first_que_first = findViewById(R.id.third_first_que_first);
        Button third_first_que_second = findViewById(R.id.third_first_que_second);
        Button third_first_que_third = findViewById(R.id.third_first_que_third);
        RadioGroup third_radioGroup = findViewById(R.id.third_first_que);

        third_radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.third_first_que_first) {
                    third_first_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.third_first_que_second) {
                    third_first_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.third_first_que_third) {
                    third_first_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button third_second_que_first = findViewById(R.id.third_second_que_first);
        Button third_second_que_second = findViewById(R.id.third_second_que_second);
        Button third_second_que_third = findViewById(R.id.third_second_que_third);
        RadioGroup third_radioGroup2 = findViewById(R.id.third_second_que);

        third_radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.third_second_que_first) {
                    third_second_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id.third_second_que_second) {
                    third_second_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id.third_second_que_third) {
                    third_second_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  third_third_que_first = findViewById(R.id. third_third_que_first);
        Button  third_third_que_second = findViewById(R.id. third_third_que_second);
        Button  third_third_que_third = findViewById(R.id. third_third_que_third);
        RadioGroup  third_radioGroup3 = findViewById(R.id. third_third_que);

        third_radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_third_que_first) {
                    third_third_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. third_third_que_second) {
                    third_third_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_third_que_third) {
                    third_third_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  third_fourth_que_first = findViewById(R.id. third_fourth_que_first);
        Button  third_fourth_que_second = findViewById(R.id. third_fourth_que_second);
        Button  third_fourth_que_third = findViewById(R.id. third_fourth_que_third);
        RadioGroup  third_radioGroup4 = findViewById(R.id. third_fourth_que);

        third_radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_fourth_que_first) {
                    third_fourth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_fourth_que_second) {
                    third_fourth_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. third_fourth_que_third) {
                    third_fourth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  third_fifth_que_first = findViewById(R.id. third_fifth_que_first);
        Button  third_fifth_que_second = findViewById(R.id. third_fifth_que_second);
        Button  third_fifth_que_third = findViewById(R.id. third_fifth_que_third);
        RadioGroup  third_radioGroup5 = findViewById(R.id. third_fifth_que);


        third_radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_fifth_que_first) {
                    third_fifth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_fifth_que_second) {
                    third_fifth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_fifth_que_third) {
                    third_fifth_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });

        Button  third_sixth_que_first = findViewById(R.id. third_sixth_que_first);
        Button  third_sixth_que_second = findViewById(R.id. third_sixth_que_second);
        Button  third_sixth_que_third = findViewById(R.id. third_sixth_que_third);
        RadioGroup  third_radioGroup6 = findViewById(R.id. third_sixth_que);


        third_radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_sixth_que_first) {
                    third_sixth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_sixth_que_second) {
                    third_sixth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_sixth_que_third) {
                    third_sixth_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });

        Button  third_seventh_que_first = findViewById(R.id. third_seventh_que_first);
        Button  third_seventh_que_second = findViewById(R.id. third_seventh_que_second);
        Button  third_seventh_que_third = findViewById(R.id. third_seventh_que_third);
        RadioGroup  third_radioGroup7 = findViewById(R.id. third_seventh_que);


        third_radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_seventh_que_first) {
                    third_seventh_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. third_seventh_que_second) {
                    third_seventh_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_seventh_que_third) {
                    third_seventh_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });

        Button  third_eight_que_first = findViewById(R.id. third_eight_que_first);
        Button  third_eight_que_second = findViewById(R.id. third_eight_que_second);
        Button  third_eight_que_third = findViewById(R.id. third_eight_que_third);
        RadioGroup  third_radioGroup8 = findViewById(R.id. third_eight_que);


        third_radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_eight_que_first) {
                    third_eight_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_eight_que_second) {
                    third_eight_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_eight_que_third) {
                    third_eight_que_third.setTextColor(Color.rgb(101, 235, 145));
                }
            }
        });

        Button  third_ninth_que_first = findViewById(R.id. third_ninth_que_first);
        Button  third_ninth_que_second = findViewById(R.id. third_ninth_que_second);
        Button  third_ninth_que_third = findViewById(R.id. third_ninth_que_third);
        RadioGroup  third_radioGroup9 = findViewById(R.id. third_ninth_que);


        third_radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_ninth_que_first) {
                    third_ninth_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. third_ninth_que_second) {
                    third_ninth_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_ninth_que_third) {
                    third_ninth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });

        Button  third_tenth_que_first = findViewById(R.id. third_tenth_que_first);
        Button  third_tenth_que_second = findViewById(R.id. third_tenth_que_second);
        Button  third_tenth_que_third = findViewById(R.id. third_tenth_que_third);
        RadioGroup  third_radioGroup10 = findViewById(R.id. third_tenth_que);


        third_radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_tenth_que_first) {
                    third_tenth_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_tenth_que_second) {
                    third_tenth_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. third_tenth_que_third) {
                    third_tenth_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  third_eleventh_que_first = findViewById(R.id. third_eleventh_que_first);
        Button  third_eleventh_que_second = findViewById(R.id. third_eleventh_que_second);
        Button  third_eleventh_que_third = findViewById(R.id. third_eleventh_que_third);
        RadioGroup  third_radioGroup11 = findViewById(R.id. third_eleventh_que);


        third_radioGroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_eleventh_que_first) {
                    third_eleventh_que_first.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_eleventh_que_second) {
                    third_eleventh_que_second.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. third_eleventh_que_third) {
                    third_eleventh_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
        Button  third_twelv_que_first = findViewById(R.id. third_twelv_que_first);
        Button  third_twelv_que_second = findViewById(R.id. third_twelv_que_second);
        Button  third_twelv_que_third = findViewById(R.id. third_twelv_que_third);
        RadioGroup  third_radioGroup12 = findViewById(R.id. third_twelv_que);


        third_radioGroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_twelv_que_first) {
                    third_twelv_que_first.setTextColor(Color.rgb(101, 235, 145));
                } else if (checkedId == R.id. third_twelv_que_second) {
                    third_twelv_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_twelv_que_third) {
                    third_twelv_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });

        Button  third_thirteen_que_first = findViewById(R.id. third_thirteen_que_first);
        Button  third_thirteen_que_second = findViewById(R.id. third_thirteen_que_second);
        Button  third_thirteen_que_third = findViewById(R.id. third_thirteen_que_third);
        RadioGroup  third_radioGroup13 = findViewById(R.id. third_thirteen_que);


        third_radioGroup13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id. third_thirteen_que_first) {
                    third_thirteen_que_first.setTextColor(Color.rgb(101, 235, 145));
                    third_imageButton.setImageResource(R.drawable.super2);
                } else if (checkedId == R.id. third_thirteen_que_second) {
                    third_thirteen_que_second.setTextColor(Color.rgb(255, 79, 100));
                } else if (checkedId == R.id. third_thirteen_que_third) {
                    third_thirteen_que_third.setTextColor(Color.rgb(255, 79, 100));
                }
            }
        });
    }

}
