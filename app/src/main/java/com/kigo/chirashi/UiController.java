package com.kigo.chirashi;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class UiController {
    private AppCompatActivity activity;
    private Button btnStar;

    public UiController(AppCompatActivity activity) {
        this.activity = activity;
        // 画面の読み込みが完全に安全に終わるのを待ってからビューを初期化する
        activity.getWindow().getDecorView().post(new Runnable() {
            @Override
            public void run() {
                initViews();
            }
        });
    }

    private void initViews() {
        btnStar = activity.findViewById(R.id.btnStar);
    }
}
