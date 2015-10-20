package com.example.sisilai.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

/**
 * Created by sisilai on 2015/10/16.
 */
public class buttonClick extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_click);

        final EditText txt = (EditText)findViewById(R.id.txt);
        Button btn = (Button)findViewById(R.id.btn);
        Button helloBtn = (Button)findViewById(R.id.gotoHelloBtn);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(R.string.editclick_text);
            }
        });
        helloBtn.setOnClickListener(new MyListener());
        activityFactory.addActivity(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        activityFactory.removeActivity(this);
    }

    private class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //Intent intent =new Intent(buttonClick.this,MainActivity.class);
            //Bundle data = new Bundle();
            final EditText txt1 = (EditText)findViewById(R.id.txt);
            //data.putString("editContent", txt1.getText().toString());
            //intent.putExtras(data);
            //putExtras(data);
            //intent.setAction(IAction);
            //intent.addCategory(ICategory);
            //startActivity(intent);
            //finish();
            MainActivity.startAction(buttonClick.this,txt1.getText().toString());
        }
    }
}
