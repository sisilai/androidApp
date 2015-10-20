package com.example.sisilai.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Created by sisilai on 2015/10/19.
 */
public class progressBarDemo extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.progressbar_demo);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        int BtnId = v.getId();
        switch (BtnId) {
            case R.id.btn:
                ProgressBar bar = (ProgressBar) findViewById(R.id.bar);
//        int progress = bar.getProgress();
//        bar.setProgress(progress + 10);
                if (bar.getVisibility() == View.GONE) {
                    bar.setVisibility(View.VISIBLE);
                } else {
                    bar.setVisibility(View.GONE);
                }
                break;
            default:
                break;
        }
    }
}
