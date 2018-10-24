package com.coordinatorpattern;

import android.app.Application;

public class CoordinatorPattern extends Application {

    AppCoordinator appCoordinator = null;

    @Override
    public void onCreate() {
        super.onCreate();
        this.appCoordinator = new AppCoordinator();
        this.registerActivityLifecycleCallbacks(appCoordinator);
    }
}
