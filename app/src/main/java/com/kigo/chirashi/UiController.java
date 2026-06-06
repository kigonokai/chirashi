package com.kigo.chirashi;

import android.app.Activity;
import android.widget.Button;

public class UiController {
    private Activity activity;
    private Button btnStar;

    public UiController(Activity activity) {
        this.activity = activity;
        initViews();
    }

    private void initViews() {
        btnStar = activity.findViewById(R.id.btnStar);
    }
}
