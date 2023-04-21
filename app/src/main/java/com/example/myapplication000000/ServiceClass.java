package com.example.myapplication000000;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

import com.example.myapplication000000.ui.activities.MainActivity;
import com.example.myapplication000000.ui.activities.MainActivity;

public class ServiceClass extends Service {

    private WindowManager windowManager;
    private View bannerView;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        bannerView = LayoutInflater.from(this).inflate(R.layout.service_layout, null);
        Intent intent= new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        bannerView.setOnClickListener(v -> {
            try {
                pendingIntent.send();
                stopSelf();//остановка сервиса
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        });
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        windowManager.addView(bannerView, params);

        windowManager.updateViewLayout(bannerView, params);
        params.gravity = Gravity.CENTER;
    }
    public void onDestroy() {
        super.onDestroy();
        if (windowManager != null) {
            windowManager.removeView(bannerView);
        }
    }

}
