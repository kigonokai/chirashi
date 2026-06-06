package com.kigo.chirashi;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private UiController uiController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uiController = new UiController(this);
    }
}
