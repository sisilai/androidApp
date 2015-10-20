package com.example.sisilai.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by sisilai on 2015/10/19.
 */
public class mainFragment extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);
        Button btn = (Button)findViewById(R.id.left_btn);
        Log.d("mainFragment-d","开始点击事件");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mainFragment-d","进入点击事件");
                OtherFragment otherFragment = new OtherFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.layout.right_fragment,otherFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
