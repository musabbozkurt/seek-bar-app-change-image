package com.example.mb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    int progress = 0;
    int[] image = new int[]{
            R.drawable.sagittal_boyun_1, R.drawable.sagittal_boyun_2, R.drawable.sagittal_boyun_3, R.drawable.sagittal_boyun_4,
            R.drawable.sagittal_boyun_5, R.drawable.sagittal_boyun_6, R.drawable.sagittal_boyun_7, R.drawable.sagittal_boyun_8,
            R.drawable.sagittal_boyun_9, R.drawable.sagittal_boyun_10, R.drawable.sagittal_boyun_11,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageResource(image[0]);

        seekBar.setMax(10);
        seekBar.setProgress(progress);

        textView.setText("" + progress);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                textView.setText("" + progress);
                imageView.setImageResource(image[progress]);
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
