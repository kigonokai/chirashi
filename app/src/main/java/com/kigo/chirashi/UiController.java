package com.kigo.chirashi;

import android.view.View;
import com.google.android.material.button.MaterialButton;

public class UiController {

    public interface UiEventListener {
        void onStarClicked();
        void onHeartClicked();
        void onImageClicked();
        void onDownloadClicked();
    }

    private final MainActivity activity;
    private final UiEventListener listener;

    private MaterialButton btnStar;
    private MaterialButton btnHeart;
    private MaterialButton btnImage;
    private MaterialButton btnDownload;

    public UiController(MainActivity activity, UiEventListener listener) {
        this.activity = activity;
        this.listener = listener;
    }

    public void initializeUi() {
        btnStar = activity.findViewById(R.id.btnStar);
        btnHeart = activity.findViewById(R.id.btnHeart);
        btnImage = activity.findViewById(R.id.btnImage);
        btnDownload = activity.findViewById(R.id.btnDownload);

        setupClickListeners();
        requestInitialFocus();
    }

    private void setupClickListeners() {
        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) listener.onStarClicked();
            }
        });

        btnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) listener.onHeartClicked();
            }
        });

        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) listener.onImageClicked();
            }
        });

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) listener.onDownloadClicked();
            }
        });
    }

    private void requestInitialFocus() {
        if (btnStar != null) {
            btnStar.requestFocus();
        }
    }
}