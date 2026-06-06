package com.kigo.chirashi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements UiController.UiEventListener {

    private UiController uiController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.id.activity_main);

        uiController = new UiController(this, this);
        uiController.initializeUi();
    }

    @Override
    public void onStarClicked() {
    }

    @Override
    public void onHeartClicked() {
    }

    @Override
    public void onImageClicked() {
    }

    @Override
    public void onDownloadClicked() {
    }
}