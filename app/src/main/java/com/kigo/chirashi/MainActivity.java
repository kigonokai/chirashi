package com.kigo.chirashi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private UiController uiController;

    @Override
    protected void Bundle(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uiController = new UiController(this);
    }
}
