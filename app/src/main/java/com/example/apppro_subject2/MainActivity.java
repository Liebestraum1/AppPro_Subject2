package com.example.apppro_subject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int color = 0;
    int red, green, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 텍스트 입출력 부분
        EditText et_text = findViewById(R.id.et_text);
        SeekBar sb_size = findViewById(R.id.sb_size);
        SeekBar sb_red = findViewById(R.id.sb_red);
        SeekBar sb_green = findViewById(R.id.sb_green);
        SeekBar sb_blue = findViewById(R.id.sb_blue);

        et_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                TextView tv_preview = findViewById(R.id.tv_preview);
                tv_preview.setText(s);
            }
        });

        //텍스트 사이즈 변경하는 부분
        sb_size.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextView tv_preview = findViewById(R.id.tv_preview); // 예시 텍스트의 id인 tv_preview 인스턴스를 찾아오는 부분
                tv_preview.setTextSize(progress); // setTextSize 함수를 통해 텍스트 사이즈를 지정, progress 를 인수로 받아서 텍스트 크기를 조절
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //빨간바
        sb_red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red = progress;
                color = 0xFF000000 | red << 16 | green << 8 | blue;
                TextView tv_preview = findViewById(R.id.tv_preview);
                tv_preview.setTextColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //초록바
        sb_green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green = progress;
                color = 0xFF000000 | red << 16 | green << 8 | blue;
                TextView tv_preview = findViewById(R.id.tv_preview);
                tv_preview.setTextColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //파랑바
        sb_blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue = progress;
                color = 0xFF000000 | red << 16 | green << 8 | blue;
                TextView tv_preview = findViewById(R.id.tv_preview);
                tv_preview.setTextColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}