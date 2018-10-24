package com.coordinatorpattern.scene.main;

import android.app.Activity;
import android.content.Context;
import com.coordinatorpattern.CoordinatorDelegate;

public class MainCoordinator implements CoordinatorDelegate, MainActivityDelegate {

    public MainCoordinatorDelegate delegate;
    @SuppressWarnings("FieldCanBeLocal")
    private MainActivity mainActivity;

    @Override
    public void homeButtonTapped(Context ctx) {
        delegate.goToHome(ctx);
    }

    @Override
    public void start(Context ctx) {}

    public void setMainActivity(Activity activity) {
        mainActivity = (MainActivity) activity;
        mainActivity.delegate = this;
    }
}
