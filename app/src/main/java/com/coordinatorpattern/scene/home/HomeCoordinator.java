package com.coordinatorpattern.scene.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.coordinatorpattern.CoordinatorDelegate;

public class HomeCoordinator implements CoordinatorDelegate, HomeActivityDelegate {

    public HomeCoordinatorDelegate delegate;
    private HomeActivity homeActivity;

    @Override
    public void start(Context ctx) {
        homeActivity = null;
        Intent intent = new Intent(ctx, HomeActivity.class);
        ctx.startActivity(intent);
    }

    @Override
    public void buttonTapped() {
        Log.d("HomeCoordinator","Button Tapped");
    }

    public void setHomeActivity(Activity activity) {
        homeActivity = (HomeActivity) activity;
        homeActivity.delegate = this;
    }

}
