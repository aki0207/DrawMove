package com.example.drawmove;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyView myView = (MyView)findViewById(R.id.my_view);


        final Handler handler = new Handler();
        final Runnable r = new Runnable() {
            int count = 0;
            String counter = "";
            @Override
            public void run() {
                // UIスレッド
                count++;
                if (count > 10) { // 5回実行したら終了
                    return;
                }

                //描画位置変更
                myView.Move();
                //再描画
                myView.invalidate();
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(r);


    }
}
