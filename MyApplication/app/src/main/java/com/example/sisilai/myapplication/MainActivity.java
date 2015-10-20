package com.example.sisilai.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private static String IAction = "hello_world";
    private static String ICategory = "hello";
    public static void startAction(Context context,String data1) {
        Intent intent = new Intent(context,MainActivity.class);
        intent.putExtra("editContent",data1);
        intent.setAction(IAction);
        intent.addCategory(ICategory);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = this.getIntent();
        Bundle data = intent.getExtras();
        String text = data.getString("editContent");
        TextView txt = (TextView)findViewById(R.id.intentText);
        Log.d("sisilai", "this is debugMsg");
        String action = intent.getAction();
        Set<String> categories = intent.getCategories();
        txt.setText(text + "\n" + action + "\n" + categories + "\n");
        activityFactory.addActivity(this);
//        Button btnExit = (Button)findViewById(R.id.btn_exit);
//        btnExit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                activityFactory.delActivity();
//            }
//        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        activityFactory.removeActivity(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
