package com.coordinatorpattern;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.coordinatorpattern.scene.main.*;
import com.coordinatorpattern.scene.home.*;

public class AppCoordinator implements CoordinatorDelegate, MainCoordinatorDelegate, HomeCoordinatorDelegate, Application.ActivityLifecycleCallbacks {

    private MainCoordinator mainCoordinator;
    private HomeCoordinator homeCoordinator;

    AppCoordinator(){
        mainCoordinator = new MainCoordinator();
        mainCoordinator.delegate = this;
        homeCoordinator = new HomeCoordinator();
        homeCoordinator.delegate = this;
    }

    @Override
    public void start(Context ctx) {}

    @Override
    public void goToHome(Context ctx) {
        homeCoordinator.start(ctx);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if (activity.getClass().getSimpleName().equals("MainActivity")) {
            this.mainCoordinator.setMainActivity(activity);
        }
        if (activity.getClass().getSimpleName().equals("HomeActivity")) {
            this.homeCoordinator.setHomeActivity(activity);
        }
    }
    @Override
    public void onActivityStarted(Activity activity) {}
    @Override
    public void onActivityResumed(Activity activity) {}
    @Override
    public void onActivityPaused(Activity activity) {}
    @Override
    public void onActivityStopped(Activity activity) {}
    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {}
    @Override
    public void onActivityDestroyed(Activity activity) {}
}
