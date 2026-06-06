package com.kigo.chirashi;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class UiController {
    private AppCompatActivity activity;
    private Button btnStar;

    public UiController(AppCompatActivity activity) {
        this.activity = activity;
        initViews();
    }

    private void initViews() {
        btnStar = activity.findViewById(R.id.btnStar);
    }
}
